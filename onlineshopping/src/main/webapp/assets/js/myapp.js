$(function()
{
	switch(menu)
	{
		case 'About':
			$('#about').addClass('active');
			break;
		case 'Contact Us':
			$('#contact').addClass('active');
			break;
		case 'Services':
			$('#services').addClass('active');
			break;
		case 'Home':
			$('#home').addClass("active");
		/*default:
			$('#home').addClass('active');
			break;*/
			
	}
});