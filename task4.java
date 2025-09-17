import java.io.FileWriter;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScraper {

    public static void main(String[] args) {
        String url = "https://www.scrapethissite.com/pages/simple/"; 
        String csvFile = "products.csv";

        try (FileWriter writer = new FileWriter(csvFile)) {
          
            writer.append("Product Name,Price\n");

            
            Document doc = Jsoup.connect(url)
                                .timeout(6000) 
                                .get();

           
          
            
            Elements products = doc.select(".product-item");

     
            for (Element product : products) {
              
                String name = product.select(".product-name").text();

          
                String price = product.select(".product-price").text();

                
                writer.append(name).append(",").append(price).append("\n");
            }

            System.out.println("Data successfully written to " + csvFile);

        } catch (IOException e) {
            System.err.println("Error during web scraping or file writing: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
