/**
 * 
 */


let loginButton = document.getElementsByClassName("loginButton")[0];
console.log(loginButton);
loginButton.addEventListener("click",()=> {
	let username = document.querySelector("input[name='username']").value;
	let password = document.querySelector("input[name='password']").value;
	let formData = new URLSearchParams();
	formData.append("username",username);
	formData.append("password",password);
	fetch("Login",{
		method: 'post',
		body: formData
	}).then(res=>res.json())
	.then(json=>{
		let loginMessage = document.getElementsByClassName("loginMessage")[0];
		if(json.status!=200) {
			loginMessage.innerHTML = `<p>${json.message}</p>
		                       <p> Try Again </p>`
		}
		loginMessage.innerHTML = `<p>${json.message}</p>
		<a href="index.jsp">Go to Home Page</p>
		<p></p>`;
	})
	.catch(err=>console.log(err));
});
