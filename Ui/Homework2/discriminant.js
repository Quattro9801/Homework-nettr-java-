function clrValue()
{	
		var res=document.getElementById('myInput').value='';
		var clrA = document.getElementById('name_A').value='';
		var clrB = document.getElementById('name_B').value='';
		var clrC = document.getElementById('name_C').value='';
}

 function readingValue()
 {	
		var A = document.getElementById('name_A').value;
		var B = document.getElementById('name_B').value;
		var C = document.getElementById('name_C').value;
		addRow(A,B,C);	
 }

function addRow(A,B,C)
{		
		var x1;
		var x2;
		if (A.replace(/\s/g, '').length === 0 || isNaN(A) || (B.replace(/\s/g, '').length === 0 || isNaN(B)) || C.replace(/\s/g, '').length === 0 || isNaN(C)) {
			 
			 document.getElementById('myInput').value="Введены некорректные данные";
		}		
		else{
			document.getElementById('myInput').value="Введены корректные данные";
			D=B*B-4*A*C;
		if (D==0)
		{
		x1=(-B/(2*A));
		x2=(-B/(2*A));
		}
		if (D<0)
		{
			x1="Нет действительныйх корней";
			x2="Нет действительныйх корней";
		}
		else {
			x1=(-B+Math.sqrt(D))/ ( 2 * A)
			x2=(-B-Math.sqrt(D))/ ( 2 * A)
		}
		// Находим нужную таблицу
		var tbody = document.getElementById('tab1').getElementsByTagName('TBODY')[0];
		// Создаем строку таблицы и добавляем ее
		var row = document.createElement("TR");
		tbody.appendChild(row);
		// Создаем ячейки в вышесозданной строке
		// и добавляем тх
		var td1 = document.createElement("TD");
		var td2 = document.createElement("TD");
		 var td3 = document.createElement("TD");
		row.appendChild(td1);
		row.appendChild(td2);
		row.appendChild(td3);
		// Наполняем ячейки
		td1.innerHTML = x1;
		td2.innerHTML = x2;
		td3.innerHTML = D;
		tab1.addEventListener('click', function(evt){
		if(evt.target.closest('TD')) {
		evt.target.closest('tr').remove()
	
			}
		})
		}
}
 

