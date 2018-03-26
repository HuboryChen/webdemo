$(function(){

	/***********  导航效果  ***********/

   window.onload = function (){
		    document.getElementById('main').contentWindow.location.reload(true);
        var oUl = document.getElementById('list');
        var aSpan = oUl.getElementsByTagName('span');
        var aUl = oUl.getElementsByTagName('ul');
        var aA = oUl.getElementsByTagName('a');
        var aLi = null;
        var arrLi = [];

        for( var i=0; i<aSpan.length; i++ ){
            aSpan[i].index = i;
            aUl[0].style.display = 'block';
            aSpan[0].style.color="#21841d";
            aSpan[0].style.backgroundColor="#e5e5e5";
            //aSpan[0].className = 'spanclic';

            aSpan[i].onclick = function (){

                for( var i=0; i<aSpan.length; i++ ){
                    if( i != this.index ){
                        aUl[i].style.display = 'none';
                        aSpan[i].className = '';
                        aSpan[i].style.color="#fff";
                        aSpan[i].style.backgroundColor="";
                       // aSpan[i].className = 'spanclicout';
                    }else{

                      aSpan[i].style.color="#21841d";
                      aSpan[i].style.backgroundColor="#e5e5e5";
                        //aSpan[0].className = 'spanclic';
                     }
                }

                if( this.className == '' ){
                    aUl[this.index].style.display = 'block';
                    this.className = 'active';
                }
            };
        }

        for( var i=0; i<aUl.length; i++ ){
            aLi = aUl[i].getElementsByTagName('li');
            for( var j=0; j<aLi.length; j++ ){
                arrLi.push( aLi[j] );
            }
        }

        for( var i=0; i<arrLi.length; i++ ){
            arrLi[i].onclick = function (){

                for( var i=0; i<arrLi.length; i++ ){
                    if( arrLi[i] !=this ){
                        arrLi[i].className = '';
                    }
                }
                if( this.className == '' ){
                    this.className = 'active';
                }
            };
        }
    };



	/***********  点击导航给 iframe 匹配相应链接  ***********/

    $(".lis ul li a").each(function(i){
    	$(this).click(function(){
    		var iframeSrc = [
    			"project/project_index.jsp",
                "project/project_list.jsp",
                "project/task_allocation.jsp",
                "project/performance_appraisal.jsp",
                "project/data_analysis.jsp",
    			"pd/pdresult.jsp",
    			"pd/pdanalyse.jsp",
    			"daily/dailylist.jsp",
    			"daily/daliyanalyse.jsp",
    			"analyse/analyse.jsp",
    			"system/emplist.jsp",
    			"system/role.jsp",
    			"system/log.jsp"
    		];
    		$("#main").attr("src",iframeSrc[i]);
    		$(".lis ul li a").css({
    			"color":"#114f8e",
                "font-weight":"normal"
    		})
    		$(this).css({
    			"color":"#21841d",
                "font-weight":"bold"
    		});
    	})
    })


	/***********  模拟点击第一个导航  ***********/

    $("#trigger").trigger("click");





    /***********  iframe高度赋值  ***********/

    var bodyHeight = $(window).outerHeight();
    var topHeight = $("#top").outerHeight();
    var bottonHeight = $("#botton").outerHeight();
    var mainHeight = bodyHeight - topHeight - bottonHeight - 5;
    $("#main").height(mainHeight);
})
