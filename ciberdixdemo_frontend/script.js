(function(a){a.fn.extend({center:function(){return this.each(function(){var b=(a(window).height()-a(this).outerHeight())/2,
c=(a(window).width()-a(this).outerWidth())/2;a(this).css({position:"absolute",margin:0,top:(b>0?b:0)+"px",left:(c>0?c:0)+"px"})})}})})(jQuery);





jQuery('#login_box').center();
	jQuery('#txtUsuario').focus();
	jQuery(window).resize(function () {
                    jQuery('#login_box').center();
});


