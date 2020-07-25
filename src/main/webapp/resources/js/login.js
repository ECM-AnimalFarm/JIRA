document.addEventListener('DOMContentLoaded', ()=>{
	const signUpButton = document.getElementById('signUp');
	const signInButton = document.getElementById('signIn');
	const container = document.getElementById('container');
	const forgotPassword = document.getElementById('forgot_password');
	
	
	signUpButton.addEventListener('click', () => {
		container.classList.add("right-panel-active");
	});

	signInButton.addEventListener('click', () => {
		document.getElementById('forgot-password-container').style.visibility = 'hidden';
		container.classList.remove("right-panel-active-password");
		container.classList.remove("right-panel-active");
	});
	
	forgotPassword.addEventListener('click', () => {
		document.getElementById('forgot-password-container').style.visibility = 'visible';
		container.classList.add("right-panel-active-password");
	});
	
	//sign-in-container and sign-up-container 
})
