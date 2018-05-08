var i=1;
var img=document.getElementById('image_slider');
function left() {
	if(i==1)
	{
		i=2;
		img.src="image/image"+i+".jpg";	
	}
	else
	{
		i=i-1;
		img.src="image/image"+i+".jpg";
	}
}
function right() {
	if(i==2)
	{
		i=1;
		img.src="image/image"+i+".jpg";
	}
	else
	{

		i=i+1;
		img.src="image/image"+i+".jpg";
	}
}