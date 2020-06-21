function getPickupLines(){
  $.ajax({
    url: 'http://127.0.0.1:8080/lines/random'
  }).then(function(data){
    $('.line').empty().append(data.content).css({'color': getRandomColor()});
  })
}


function getRandomColor() {
  var letters = '0123456789ABCDEF';
  var color = '#';
  for (var i = 0; i < 6; i++) {
    color += letters[Math.floor(Math.random() * 16)];
  }
  return color;
}

$(document).ready(function() {
  getPickupLines();

  window.setInterval(function(){getPickupLines()}, 5000);
})
