/*
    Document   : searchuno
    Created on : Jul 13, 2011, 6:49:49 PM
    Author     : Rishabh Rao
    Description: Contains the core administration logic.
*/

jQuery(document).ready(function(){
	jQuery('#search-submit-button').button({
		icons: {
			primary: 'ui-icon-search'
		}
	});
	jQuery('#search-clear-button').button();
	jQuery('#panel-manage-button').button({
		icons: {
			primary: 'ui-icon-wrench'
		}
	});


	jQuery('.sports-accordion').accordion({animated: false, collapsible: true});
	jQuery('.magazines-accordion').accordion({animated: false, collapsible: true});
	jQuery('.news-accordion').accordion({animated: false, collapsible: true});

	jQuery('.category-tabs').tabs();
});