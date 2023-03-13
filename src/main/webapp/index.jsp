<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Selecció de categorias de libos</title>
</head>
<body>
<h1 align='center'>Pàgina de libros</h1>
<p>Selecciona categoria:</p>
<form action="SelectCategory.do" method="POST" focus="category">
    Categoria: <select name="category">
    <option value="Fantasia">Fantasia</option>
    <option value="Terror">Terror</option>
    <option value="Romance">Romance</option>
</select> <br />
    <p style="margin-top: 50px;">
        <button type="submit" value="Submit">D'acord</button>
    </p>
</form>
</body>
</html>