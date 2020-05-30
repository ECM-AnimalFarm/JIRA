document.addEventListener('DOMContentLoaded', ()=>{
	const signUpButton = document.getElementById('signUp');
	const signInButton = document.getElementById('signIn');
	const container = document.getElementById('container');
	const forgotPassword = document.getElementById('forgot_password');
	
	signUpButton.addEventListener('click', () => {
		container.classList.add("right-panel-active");
	});

	signInButton.addEventListener('click', () => {
		container.classList.remove("right-panel-active");
		container.classList.add("right-panel-active-password");
	});
	
	forgotPassword.addEventListener('click', () =>{
		container.classList.add("right-panel-active-password");
	});
	
})
