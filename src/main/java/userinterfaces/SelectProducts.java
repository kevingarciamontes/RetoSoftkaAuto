package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class SelectProducts {
    SelectProducts() {}

    public static final Target YOUR_STORE = Target.the("")
            .locatedBy("//a[contains(text(),'Your Store')]\n");


    public static final Target PRODUCT_ONE = Target.the("texto para seleccionar el producto 1 iphone")
            .locatedBy("//div[contains(@class,'product-thumb')][.//a[text()='iPhone']]//button[contains(@onclick,'cart.add')]");

    public static final Target PRODUCT_TWO = Target.the("Botón para agregar MacBook")
            .located(By.xpath("//div[contains(@class,'product-thumb')][.//a[text()='MacBook']]//button[contains(@onclick,'cart.add')]"));

    public static final Target CART = Target.the("Botón carrito de compras")
            .located(By.xpath("//div[contains(@class,'btn-group')]/button[@type='button' and contains(@class,'dropdown-toggle')]"));

    public static final Target CHECKOUT = Target.the("Botón Checkout")
            .located(By.xpath("//a[.//span[normalize-space()='Checkout']]"));







}

