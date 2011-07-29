<!doctype html>
<!-- paulirish.com/2008/conditional-stylesheets-vs-css-hacks-answer-neither/ -->
<!--[if lt IE 7 ]> <html class="no-js ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]>    <html class="no-js ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]>    <html class="no-js ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--> <html class="no-js" lang="en"> <!--<![endif]-->
<head>
  <meta charset="utf-8">

  <!-- Always force latest IE rendering engine (even in intranet) & Chrome Frame
       Remove this if you use the .htaccess -->
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

  <title>RushHour</title>
  <meta name="description" content="Tracks your favourite locations for rush hour traffic!">
  <meta name="author" content="humans.txt">

  <!-- Mobile viewport optimized: j.mp/bplateviewport -->
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <!-- Place favicon.ico & apple-touch-icon.png in the root of your domain and delete these references -->
  <link rel="shortcut icon" href="favicon.ico">
  <link rel="apple-touch-icon" href="apple-touch-icon.png">

  <!-- CSS: implied media="all" -->
  <link rel="stylesheet" href="css/style.css?v=2">

	<!-- RushHour: stylesheets -->
	<!-- Header -->	<link rel="stylesheet" href="css/header.css"/>
	<!-- Body -->	<link rel="stylesheet" href="css/body.css"/>
	<!-- Main -->	<link rel="stylesheet" href="css/result-columns.css"/>
	<!-- Footer -->	<link rel="stylesheet" href="css/footer.css"/>
	<!-- /RushHour: stylesheets -->

  <!-- Uncomment if you are specifically targeting less enabled mobile browsers
  <link rel="stylesheet" media="handheld" href="css/handheld.css?v=2">  -->

  <!-- All JavaScript at the bottom, except for Modernizr which enables HTML5 elements & feature detects -->
  <script src="js/libs/modernizr-1.7.min.js"></script>

</head>

<body>
  <div id="container">
    <header>
		<div class="header-widget header-logo">
			<a href="index.html"><img src="img/searchuno.png" alt="SearchUno" /></a>
		</div>
    </header>
	<div class="ui-widget-content">
		<h3 class="ui-widget-header">Rush Hour</h3>
	    <div id="main" role="main">
	    	<div id="chart-container">
	    		<!-- Highchart goes here. -->
	    	</div>
		</div>
	</div>
    <footer>

    </footer>
  </div> <!--! end of #container -->


  <!-- JavaScript at the bottom for fast page loading -->

  <!-- Grab Google CDN's jQuery, with a protocol relative URL; fall back to local if necessary -->
  <script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.js"></script>
  <script>window.jQuery || document.write("<script type='text/javascript' src='js/libs/jquery/jquery-1.4.4.min.js'>\x3C/script>")</script>

	<!-- scripts concatenated and minified via ant build script
	RushHour: Not required
  <script type="text/javascript" src="js/plugins.js"></script>
  <script type="text/javascript" src="js/script.js"></script>
  end scripts-->

		<!-- RushHour: libraries -->
		<!-- JBar -->
			<script type="text/javascript" src="js/mylibs/jbar/jquery.bar.js"></script>
			<link rel="stylesheet" href="js/mylibs/jbar/css/style.css">
		<!-- /JBar -->

		<!-- Aristo jQuery UI theme -->
			<script type="text/javascript" src="js/libs/jquery/jquery-ui-1.8.14.min.js"></script>
			<link rel="stylesheet" href="js/mylibs/aristo/css/Aristo/jquery-ui-1.8.7.custom.css">
		<!-- /Aristo jQuery UI theme -->

		<!-- SpyBug -->
			<script type="text/javascript" src="js/mylibs/spybug/SpyBug.1.0.0.js"></script>
		<!-- /SpyBug -->
		
		<!-- HighCharts -->
			<script type="text/javascript" src="js/mylibs/highcharts/js/highcharts.js"></script>
			<script type="text/javascript" src="js/mylibs/highcharts/js/themes/dark-blue.js"></script>
		<!-- /HighCharts -->
	<!-- /RushHour: libraries -->

	<!-- RushHour: scripts -->
		<!-- Administrator -->	<script type="text/javascript" src="js/SearchUno.js"></script>
	<!-- /RushHour: scripts -->



  <!--[if lt IE 7 ]>
    <script src="js/libs/dd_belatedpng.js"></script>
    <script>DD_belatedPNG.fix("img, .png_bg"); // Fix any <img> or .png_bg bg-images. Also, please read goo.gl/mZiyb </script>
  <![endif]-->


  <!-- mathiasbynens.be/notes/async-analytics-snippet Change UA-XXXXX-X to be your site's ID -->
  <script>
    var _gaq=[["_setAccount","UA-XXXXX-X"],["_trackPageview"]];
    (function(d,t){var g=d.createElement(t),s=d.getElementsByTagName(t)[0];g.async=1;
    g.src=("https:"==location.protocol?"//ssl":"//www")+".google-analytics.com/ga.js";
    s.parentNode.insertBefore(g,s)}(document,"script"));
  </script>

</body>
</html>