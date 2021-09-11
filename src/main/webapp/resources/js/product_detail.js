function hover(element, reaction) {
	if (reaction == 'good') {
		element.setAttribute('src', 'image/reaction/goodhover.png');
	} else {
		element.setAttribute('src', 'image/reaction/badhover.png');
	}
}

function unhover(element, reaction) {
	if (reaction == 'good') {
		element.setAttribute('src', 'image/reaction/good.png');
	} else {
		element.setAttribute('src', 'image/reaction/bad.png');
	}
}