var d = document;
function clrValue(A,B,C)
{	
   var res=d.getElementById('myInput').value='';
   A = d.getElementById('name_A').value='';
   B = d.getElementById('name_B').value='';
   C = d.getElementById('name_C').value='';
 
}

 function readingValue()
 {
		var A = d.getElementById('name_A').value;
		var B = d.getElementById('name_B').value;
		var C = d.getElementById('name_C').value;
		addRow(A,B,C);
	
 }

function addRow(A,B,C)
{		
		var x1;
		var x2;
		if (A.replace(/\s/g, '').length === 0 || isNaN(A) || (B.replace(/\s/g, '').length === 0 || isNaN(B)) || C.replace(/\s/g, '').length === 0 || isNaN(C)) {
			 
			 d.getElementById('myInput').value="Введены некорректные данные";
		}		
		else{
			d.getElementById('myInput').value="Введены корректные данные";
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
		var tbody = d.getElementById('tab1').getElementsByTagName('TBODY')[0];
		// Создаем строку таблицы и добавляем ее
		var row = d.createElement("TR");
		tbody.appendChild(row);
		// Создаем ячейки в вышесозданной строке
		// и добавляем тх
		var td1 = d.createElement("TD");
		var td2 = d.createElement("TD");
		 var td3 = d.createElement("TD");
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
 clrValue(A,B,C);

