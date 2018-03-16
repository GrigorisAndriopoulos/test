import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String product_codes = "YWTBIR/YWTPWL/YLUCPHL/YLUDLG/YLUDLT/YCALGDCB/YCALGKCB/" +
                "YYCMIK/YYCPFBB/YCAIH1BB/YCSEC/YCASIQ/YFACACB/YLUMOXC/" +
                "YLUCPHMT/YEGCP/YEGDE/YEGHL/YEGRN/YEGSI/YGQSI/YHJGL/YJABBE/YJABBO/YJABBN";

        productCodesToList(product_codes);
    }

    //Greg code. method to save the input String of product_codes to an arrayList
    public static void productCodesToList(String codes){
//        String flag = codes;
//        while (flag.contains("/")){
//        }
        List<String> list = new ArrayList<String>(Arrays.asList(codes.split("/")));
        System.out.print(list);

    }

    public static void testMethodForGit(){
	System.out.println("Hello Git !");
    }


}
