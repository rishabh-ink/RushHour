/*
    Document   : searchuno
    Created on : Jul 13, 2011, 6:49:49 PM
    Author     : Rishabh Rao
    Description: Contains the core administration logic.
*/

jQuery(document).ready(function(){	
	chart = new Highcharts.Chart({
		chart: {
			renderTo: 'chart-container',
			defaultSeriesType: 'areaspline'
		},
		title: {
			text: 'Average fruit consumption during one week'
		},
		legend: {
			layout: 'vertical',
			align: 'left',
			verticalAlign: 'top',
			x: 10,
			y: 10,
			floating: true,
			borderWidth: 1,
			backgroundColor: '#FFFFFF'
		},
		xAxis: {
			categories: [
				'0',
				'1',
				'2',
				'3',
				'4',
				'5',
				'6', 
				'7', 
				'8', 
				'9', 
				'10', 
				'11', 
				'12',
				'13',
				'14',
				'15',
				'16',
				'17',
				'18',
				'19',
				'20',
				'21',
				'22',
				'23'				
			],
			plotBands: [{ // visualize the weekend
				from: 0.0,
				to: 6.0,
				color: 'rgba(68, 170, 213, .2)'
			},{ // visualize the weekend
				from: 18.0,
				to: 23.0,
				color: 'rgba(68, 170, 213, .2)'
			}]
		},
		yAxis: {
			title: {
				text: 'Fruit units'
			}
		},
		tooltip: {
			formatter: function() {
	                return ''+
					this.x +': '+ this.y +' units';
			}
		},
		credits: {
			enabled: false
		},
		plotOptions: {
			areaspline: {
				fillOpacity: 0.5
			}
		},
		series: [{
			name: 'John',
			data: [3, 4, 3, 3, 13, 3, 3, 4, 3, 3, 4, 12, 3, 4, 13, 3, 4, 3, 3, 4, 3, 3, 4, 3]
		}, {
			name: 'Jane',
			data: [3, 4, 3, 13, 4, 13, 3, 4, 13, 13, 4, 3, 3, 14, 13, 3, 14, 3, 3, 14, 3, 3, 4, 3]
		}]
	});
});