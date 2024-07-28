<%-- <%@ page import="res.BarChartExample"%> --%>
<%@ page import="org.jfree.chart.ChartFactory"%>
<%@ page import="org.jfree.chart.ChartFrame"%>
<%@ page import="org.jfree.chart.JFreeChart"%>
<%@ page import="org.jfree.chart.plot.PlotOrientation"%>
<%@ page import="org.jfree.chart.plot.CategoryPlot"%>
<%@ page import="org.jfree.data.category.DefaultCategoryDataset"%>
<%@ page import="java.awt.Color"%>
<%@page import="connection.DB"%>
<%@ page  import="java.sql.*,java.util.*,java.io.*"%>
<%@ page  import="org.jfree.chart.renderer.category.*" %>
<%@ page  import="org.jfree.chart.urls.*" %>
<%@ page  import="java.awt.*" %>
<%@ page  import="java.io.*" %>
<%@ page  import="org.jfree.chart.*" %>
<%@ page  import="org.jfree.chart.axis.*" %>
<%@ page  import="org.jfree.chart.entity.*" %>
<%@ page  import="org.jfree.chart.labels.*" %>
<%@ page  import="org.jfree.chart.plot.*" %>
<%@ page  import="org.jfree.chart.renderer.category.*" %>
<%@ page  import="org.jfree.chart.urls.*" %>
<%@ page  import="org.jfree.data.category.*" %>
<%@ page  import="org.jfree.data.general.*" %>
<%-- <%@ page import = "res.Accu1"%> --%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
 <%--  <% BarChartExample calculator = new BarChartExample(); --%>
 <%
 String name = request.getParameter("gen");
 System.out.println(name);
 BarRenderer renderer = null;
 int a =0;
 int b =0;
 int c =0;
 int d =0;
 int e1 =0;
 int f =0;
 %>
 <%-- <% 
        Accu1 accu1 = new Accu1();
        accu1.loadData();
        
        int[] tp = accu1.getTruePositives();
        int[] fp = accu1.getFalsePositives();
        int[] fn = accu1.getFalseNegatives();
        double[] accuracy = accu1.getAccuracy();
    %> --%>
 <%if(name.equalsIgnoreCase("OverAll")){ %>
  <% 
  try{
	 	
		 Connection con1=DB.getConnection();  
	    Statement stmt1 = con1.createStatement();  
	    ResultSet rs1 = stmt1.executeQuery("select SUM(fatal_2020),SUM(fatal_2021),SUM(fatal_2022),SUM(non_fatal_2020),SUM(non_fatal_2021),SUM(non_fatal_2022) from dataset1");  
	 
			while(rs1.next())
	 		{
				a = rs1.getInt(1);
				b = rs1.getInt(2);
				c = rs1.getInt(3);
				d = rs1.getInt(4);
				e1 = rs1.getInt(5);
				f = rs1.getInt(6);
				/* name = rs1.getString("uname");
				phone = rs1.getString("pn");
	       System.out.println("user_prediction.jsp"+ name+""+phone); */
	 		}
	}catch(Exception e)
	{
			System.out.println(e);
	}
  DefaultCategoryDataset dataset = new DefaultCategoryDataset();
	dataset.setValue(a,"", "fatal_2020");
	dataset.setValue(b, "", "fatal_2021");
	dataset.setValue(c, "", "fatal_2022");
	dataset.setValue(d, "", "non_fatal_2020");
	dataset.setValue(e1, "", "non_fatal_2021");
	dataset.setValue(f, "", "non_fatal_2022");
	/* dataset.setValue(60, "", "TRANSPARENCY(cm)");
	dataset.setValue(6.63, "", "HARDNESS(g)"); */
	JFreeChart chart = ChartFactory.createBarChart("OverAll details","", "Range", dataset, PlotOrientation.VERTICAL,false, true, false);
	chart.setBackgroundPaint(Color.white);
	chart.getTitle().setPaint(Color.blue);
	CategoryPlot p = chart.getCategoryPlot();
	p.setRangeGridlinePaint(Color.GREEN);
	ChartFrame framel = new ChartFrame("pervious year details",chart);
	framel.setVisible(true);
	framel.setSize(1920,1150);
	 renderer = new BarRenderer();
    Paint p1 = new GradientPaint(
            0.0f, 0.0f, new Color(16, 89, 172), 0.0f, 0.0f, new Color(201, 201, 244));
    renderer.setSeriesPaint(1, p1);

    Paint p2 = new GradientPaint(
            0.0f, 0.0f, new Color(255, 35, 35), 0.0f, 0.0f, new Color(255, 180, 180));
    renderer.setSeriesPaint(2, p2);

    p.setRenderer(renderer);
	try {
        final ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());
        final File file1 = new File("d://past_barchart.png");
        ChartUtilities.saveChartAsPNG(file1, chart, 1920, 1150, info);
    } catch (Exception e) {
        out.println(e);
    }
  %>
  <%} %>
  
  
  
  
  <%if(name.equalsIgnoreCase("Artificial Neural Networks")){ %>
  <% 
  DefaultCategoryDataset dataset = new DefaultCategoryDataset();
  /* dataset.setValue(tp[1],"", "TruePositives");
	dataset.setValue(fp[1], "", "FalsePositives");
	dataset.setValue(fn[1], "", "FalseNegatives");
	dataset.setValue(accuracy[1], "", "Accuracy"); */
	/* dataset.setValue(60, "", "TRANSPARENCY(cm)");
	dataset.setValue(6.63, "", "HARDNESS(g)"); */
	JFreeChart chart = ChartFactory.createBarChart("Artificial Neural Networks Accuracy details","", "Range", dataset, PlotOrientation.VERTICAL,false, true, false);
	chart.setBackgroundPaint(Color.white);
	chart.getTitle().setPaint(Color.blue);
	CategoryPlot p = chart.getCategoryPlot();
	p.setRangeGridlinePaint(Color.GREEN);
	ChartFrame framel = new ChartFrame("pervious year details",chart);
	framel.setVisible(true);
	framel.setSize(1920,1150);
	 renderer = new BarRenderer();
    Paint p1 = new GradientPaint(
            0.0f, 0.0f, new Color(16, 89, 172), 0.0f, 0.0f, new Color(201, 201, 244));
    renderer.setSeriesPaint(1, p1);

    Paint p2 = new GradientPaint(
            0.0f, 0.0f, new Color(255, 35, 35), 0.0f, 0.0f, new Color(255, 180, 180));
    renderer.setSeriesPaint(2, p2);

    p.setRenderer(renderer);
	try {
        final ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());
        final File file1 = new File("d://past_barchart.png");
        ChartUtilities.saveChartAsPNG(file1, chart, 1920, 1150, info);
    } catch (Exception e) {
        out.println(e);
    }
  %>
  <%} %>
  
  <%if(name.equalsIgnoreCase("Decision Tree")){ %>
  <% 
  DefaultCategoryDataset dataset = new DefaultCategoryDataset();
 /*  dataset.setValue(tp[2],"", "TruePositives");
	dataset.setValue(fp[2], "", "FalsePositives");
	dataset.setValue(fn[2], "", "FalseNegatives");
	dataset.setValue(accuracy[2], "", "Accuracy"); */
	/* dataset.setValue(60, "", "TRANSPARENCY(cm)");
	dataset.setValue(6.63, "", "HARDNESS(g)"); */
	JFreeChart chart = ChartFactory.createBarChart("Decision Tree Accuracy details","", "Range", dataset, PlotOrientation.VERTICAL,false, true, false);
	chart.setBackgroundPaint(Color.white);
	chart.getTitle().setPaint(Color.blue);
	CategoryPlot p = chart.getCategoryPlot();
	p.setRangeGridlinePaint(Color.GREEN);
	ChartFrame framel = new ChartFrame("pervious year details",chart);
	framel.setVisible(true);
	framel.setSize(1920,1150);
	 renderer = new BarRenderer();
    Paint p1 = new GradientPaint(
            0.0f, 0.0f, new Color(16, 89, 172), 0.0f, 0.0f, new Color(201, 201, 244));
    renderer.setSeriesPaint(1, p1);

    Paint p2 = new GradientPaint(
            0.0f, 0.0f, new Color(255, 35, 35), 0.0f, 0.0f, new Color(255, 180, 180));
    renderer.setSeriesPaint(2, p2);

    p.setRenderer(renderer);
	try {
        final ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());
        final File file1 = new File("d://past_barchart.png");
        ChartUtilities.saveChartAsPNG(file1, chart, 1920, 1150, info);
    } catch (Exception e) {
        out.println(e);
    }
  %>
  <%} %>
  
  
  
  <script>
//alert("OCEANOGRAPHER REGISTRATION ACCEPTED SUCCESSFULLY ");
window.location="ana_view_chart.html";
</script>
  
</body>
</html>