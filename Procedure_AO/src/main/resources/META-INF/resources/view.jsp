<%@ include file="/init.jsp" %>
<div id="ProcedureAO"></div>

<script>
YUI().use(
  'aui-tree-view',
  function(Y) {
    // Create an array object for the tree root and child nodes
    var children = [
      {
        children: [
        	{
        		label:'<a href="/group/ufficio_qualita_e_accreditamento" target="_blank">Ufficio Qualità e Accreditamento</a>'	
        	},
        	{
            	label:'<a href="/group/farmacia/welcome" target="_blank">Farmacia</a>'	
            },
        	{
            	label:'<a href=#>SIECIO/CIO</a>'	
            },
            {
            	label:'<a href=#>SPP/MC</a>'	
            },
            {
            	label:'<a href=#>Direzioni Mediche</a>'	
            },
            {
            	label:'<a href=#>SITRA</a>'	
            },
            {
            	label:'<a href=#>Comitati/Gruppi di Miglioramento</a>'	
            },
            {
            	label:'<a href=#>Accrediatmento e Controlli</a>'	
            },
            {
            	label:'<a href=#>Cartella Clinica</a>'	
            }
            
        ],
        expanded: true,
        label: '<b>&nbsp;Procedure AO</b>'
      }
    ];
    // Create a TreeView Component
    new Y.TreeView(
      {
        boundingBox: '#ProcedureAO',
        children: children
      }
    ).render();
  }
);
</script>