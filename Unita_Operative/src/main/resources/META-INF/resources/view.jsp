<%@ include file="/init.jsp" %>
<div id="UnitaOperative"></div>
<script>
YUI().use(
  'aui-tree-view',
  function(Y) {
    // Create an array object for the tree root and child nodes
    var children = [
      {
        children: [
        	{
        		label:'<a href=#>Farmacia OspedalieraIs</a>'	
        	},
        	{
            	label:'<a href=#>Staff Sistemi Informativi</a>'	
            },
        	{
            	label:'<a href=#>Sviluppo e Formazione</a>'	
            },
            {
            	label:'<a href=#>Controllo di Gestione</a>'	
            },
            {
            	label:'<a href=#>Ufficio Relazioni con il pubblico</a>'	
            },
            {
            	label:'<a href=#>Servizio Risorse Umane</a>'	
            },
            {
            	label:'<a href=#>Ufficio Valutazione</a>'	
            },
            {
            	label:'<a href=#>Flussi Informativi Sanitari</a>'	
            },
            {
            	label:'<a href=#>Laboratorio Analisi Magenta</a>'	
            },
            {
            	label:'<a href=#>Servizio Acquisti e Appalti</a>'	
            },
            {
            	label:'<a href=#> Servizio Dietietico</a>'	
            },
            {
            	label:'<a href=#> Affari Generali e Legali</a>'	
            },
            {
            	label:'<a href=#>Comitato Scientifico</a>'	
            }
        ],
        expanded: true,
        label: '<b>&nbsp;Unità Operative</b>'
      }
    ];

    // Create a TreeView Component
    new Y.TreeView(
      {
        boundingBox: '#UnitaOperative',
        children: children
      }
    ).render();
  }
);
</script>