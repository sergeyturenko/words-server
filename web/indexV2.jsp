<%--
  Created by IntelliJ IDEA.
  User: Sergey_PC
  Date: 25.02.2016
  Time: 0:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Words statistic</title>
    <style type="text/css">
        body { font-family:Arial, Helvetica, Sans-Serif; font-size:0.8em;}
        #report { border-collapse:collapse;}
        #report h4 { margin:0px; padding:0px;}
        #report img { float:right;}
        #report ul { margin:10px 0 10px 40px; padding:0px;}
        #report th { background:#7CB8E2 url(resources/img/header_bkg.png) repeat-x scroll center left; color:#fff; padding:7px 15px; text-align:left;}
        #report td { background:#C7DDEE none repeat-x scroll center left; color:#000; padding:7px 15px; }
        #report tr.odd td { background:#fff url(resources/img/row_bkg.png) repeat-x scroll center left; cursor:pointer; }
        #report div.arrow { background:transparent url(resources/img/arrows.png) no-repeat scroll 0px -16px; width:16px; height:16px; display:block;}
        #report div.up { background-position:0px 0px;}
    </style>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            $("#report tr:odd").addClass("odd");
            $("#report tr:not(.odd)").hide();
            $("#report tr:first-child").show();

            $("#report tr.odd").click(function(){
                $(this).next("tr").toggle();
                $(this).find(".arrow").toggleClass("up");
            });
            //$("#report").jExpand();
        });
    </script>
</head>
<body>
<h1>Words statistic</h1>
<table id="report">
    <tr>
        <th>File Name</th>
        <th>Population</th>
        <th>Area</th>
        <th>Official languages</th>
        <th></th>
    </tr>
    <tr>
        <td>United States of America</td>
        <td>306,939,000</td>
        <td>9,826,630 km2</td>
        <td>English</td>
        <td><div class="arrow"></div></td>
    </tr>
    <tr>
        <td colspan="5">
            <img src="125px-Flag_of_the_United_States.svg.png" alt="Flag of USA" />
            <h4>Additional information</h4>
            <ul>
                <li><a href="http://en.wikipedia.org/wiki/Usa">USA on Wikipedia</a></li>
                <li><a href="http://nationalatlas.gov/">National Atlas of the United States</a></li>
                <li><a href="http://www.nationalcenter.org/HistoricalDocuments.html">Historical Documents</a></li>
            </ul>
        </td>
    </tr>
    <tr>
        <td>United Kingdom </td>
        <td>61,612,300</td>
        <td>244,820 km2</td>
        <td>English</td>
        <td><div class="arrow"></div></td>
    </tr>
    <tr>
        <td colspan="5">
            <img src="125px-Flag_of_the_United_Kingdom.svg.png" alt="Flag of UK" />
            <h4>Additional information</h4>
            <ul>
                <li><a href="http://en.wikipedia.org/wiki/United_kingdom">UK on Wikipedia</a></li>
                <li><a href="http://www.visitbritain.com/">Official tourist guide to Britain</a></li>
                <li><a href="http://www.statistics.gov.uk/StatBase/Product.asp?vlnk=5703">Official
                    Yearbook of the United Kingdom</a></li>
            </ul>

        </td>
    </tr>
    <tr>
        <td>India</td>
        <td>1,147,995,904</td>
        <td>3,287,240‡ km2</td>
        <td>Hindi, English</td>
        <td><div class="arrow"></div></td>
    </tr>
    <tr>
        <td colspan="5">
            <img src="125px-Flag_of_India.svg.png" alt="Flag of India" />
            <h4>Additional information</h4>
            <ul>
                <li><a href="http://en.wikipedia.org/wiki/India">India on Wikipedia</a></li>
                <li><a href="http://india.gov.in/">Government of India</a></li>
                <li><a href="http://wikitravel.org/en/India">India travel guide</a></li>
            </ul>

        </td>
    </tr>
    <tr>
        <td>Canada</td>
        <td>33,718,000</td>
        <td>9,984,670 km2</td>
        <td>English, French</td>
        <td><div class="arrow"></div></td>
    </tr>
    <tr>
        <td colspan="5">
            <img src="125px-Flag_of_Canada.svg.png" alt="Flag of Canada" />
            <h4>Additional information</h4>
            <ul>
                <li><a href="http://en.wikipedia.org/wiki/Canada">Canada on Wikipedia</a></li>
                <li><a href="http://atlas.gc.ca/site/index.html" >Official
                    Government of Canada online Atlas of Canada</a></li>
                <li><a href="http://wikitravel.org/en/Canada">Canada travel guide</a></li>
            </ul>
        </td>
    </tr>
    <tr>
        <td>Germany</td>
        <td>82,060,000</td>
        <td>357,021 km2</td>
        <td>German</td>
        <td><div class="arrow"></div></td>
    </tr>
    <tr>
        <td colspan="5">
            <img src="125px-Flag_of_Germany.svg.png" alt="Flag of Germany" />
            <h4>Additional information</h4>
            <ul>
                <li><a href="http://en.wikipedia.org/wiki/Germany">Germany on Wikipedia</a></li>
                <li><a href="http://www.deutschland.de/home.php?lang=2">Deutschland.de Official Germany portal</a></li>
                <li><a href="http://www.cometogermany.com/">Germany Travel Info</a></li>
            </ul>
        </td>
    </tr>
</table>
<em>* Information taken from Wikipedia</em>
</body>
</html>