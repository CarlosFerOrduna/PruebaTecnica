<h1>PruebaTecnicaParameta</h1> 
<p>Implementar en Java un servicio Rest que reciba como parámetros los atributos del objeto
empleado (que será descrito más adelante) al ser invocado mediante el método POST.</p>

<p>El servicio deberá validar los formatos de las fechas y que los atributos no vengan vacíos,
adicionalmente deberá validar que el empleado sea mayor de edad. Una vez se hayan
superado estas validaciones se deberá almacenar la información en una base de datos mysql.
El Servicio Web responderá con el objeto en estructura JSON, en el que se deberá adicionar la
siguiente información:</p>
<li>Tiempo de Vinculación a la compañía (años, meses)</li>
<li>Edad actual del empleado (años, meses y días)</li>
<h2>Atributos del objeto empleado:</h2>
<li>Nombres (String)</li>
<li>Apellidos (String)</li>
<li>Tipo de Documento (String)</li>
<li>Número de Documento (String)</li>
<li>Fecha de Nacimiento (Date)</li>
<li>Fecha de Vinculación a la Compañía (Date)</li>
<li>Cargo (String)</li>
<li>Salario (Double)</li>
