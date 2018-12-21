var MainList = ['HTML', 'CSS', 'JavaScript'];
var Body = {
    SetBackColor: function (color) {
        document.querySelector('body').style.backgroundColor = color;
    },
    SetColor: function (color) {
        document.querySelector('body').style.color = color;
    }
}
var Link = {
    SetColor: function (color) {
        var MainList = document.querySelectorAll('a');
        var i = 0;
        while(i < MainList.length) {
            MainList[i].style.color = color;
            i = i + 1;
        }
    }
}
function nighthandler (self) {
    if(self.value==='night') {
    Body.SetBackColor('black');
    Body.SetColor('white');
    Link.SetColor('white');
    self.value = 'day';
    } else {
    Body.SetBackColor('white');
    Body.SetColor('black');
    Link.SetColor('black');
    self.value = 'night';
    }
}