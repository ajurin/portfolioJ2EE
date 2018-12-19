<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1>Contact</h1>

<form method="POST" action="">
	<div>
		<label>Nom</label>
		<input type="text" name="nom"/>
	</div>
	
	<div>
		<label>Prénom</label>
		<input type="text" name="prenom"/>
	</div>
	
	<div>
		<label>Téléphone</label>
		<input type="tel" name="tel"/>
	</div>
	
	<div>
		<label>Message</label>
		<textarea rows="5" cols="5"></textarea>
	</div>
	
	<div>
		<input type="checkbox" name=""/>
		<label>Conformément au RGPD.....</label>
	</div>
	
	<div>
		<button name="envoyer" type="submit">Envoyer</button>
	</div>
</form>