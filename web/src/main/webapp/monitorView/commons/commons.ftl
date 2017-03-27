<#assign base=request.contextPath />

<#--app 主列表模板-->
<script>
    function Sys() {
    }
    Sys.prototype.getContextPath = function(){
        return  "${base}";
    }
    sys = new Sys();

</script>

