"# PruebaTecnicaParameta" 
<p>Implementar en Java un servicio Rest que reciba como parámetros los atributos del objeto
empleado (que será descrito más adelante) al ser invocado mediante el método POST.</p>

<p>El servicio deberá validar los formatos de las fechas y que los atributos no vengan vacíos,
adicionalmente deberá validar que el empleado sea mayor de edad. Una vez se hayan
superado estas validaciones se deberá almacenar la información en una base de datos mysql.
El Servicio Web responderá con el objeto en estructura JSON, en el que se deberá adicionar la
siguiente información:</p>
<li>
<ul>Tiempo de Vinculación a la compañía (años, meses)</ul>
<ul>Edad actual del empleado (años, meses y días)</ul>
</li>
<h2>Atributos del objeto empleado:</h2>
<li>
<ul>Nombres (String)</ul>
<ul>Apellidos (String)</ul>
<ul>Tipo de Documento (String)</ul>
<ul>Número de Documento (String)</ul>
<ul>Fecha de Nacimiento (Date)</ul>
<ul>Fecha de Vinculación a la Compañía (Date)</ul>
<ul>Cargo (String)</ul>
<ul>Salario (Double)</ul>
</li>
