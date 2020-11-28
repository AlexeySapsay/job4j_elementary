package ru.job4j.pojo;

import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class ShopDropTest {

    @Test
    public void when0DropFirst() {
        Product[] products = new Product[1];
        products[0] = new Product("Milk", 10);
        Product[] rsl = ShopDrop.leftShift(products, 0);
        assertThat(rsl[0], is(nullValue()));
    }

    @Test
    public void whenDropFirst() {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        Product[] rsl = ShopDrop.leftShift(products, 0);
        assertThat(rsl[0].getName(), is("Bread"));
        assertThat(rsl[1], is(nullValue()));
    }

    @Test
    public void whenDropLast() {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        Product[] rsl = ShopDrop.leftShift(products, 1);
        assertThat(rsl[0].getName(), is("Milk"));
        assertThat(rsl[1], is(nullValue()));
    }

    @Test
    public void when0DropLast() {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Chees", 10);
        products[3] = new Product("Eggs", 100);
        products[4] = new Product("Wine", 12);
        Product[] rsl = ShopDrop.leftShift(products, 0);
        assertThat(rsl[0].getName(), is("Bread"));
        assertThat(rsl[1].getName(), is("Chees"));
        assertThat(rsl[2].getName(), is("Eggs"));
        assertThat(rsl[3].getName(), is("Wine"));
        assertThat(rsl[4], is(nullValue()));
    }

    @Test
    public void when4DropLast() {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Chees", 10);
        products[3] = new Product("Eggs", 100);
        products[4] = new Product("Wine", 12);
        Product[] rsl = ShopDrop.leftShift(products, 1);
        assertThat(rsl[0].getName(), is("Milk"));
        assertThat(rsl[1].getName(), is("Chees"));
        assertThat(rsl[2].getName(), is("Eggs"));
        assertThat(rsl[3].getName(), is("Wine"));
        assertThat(rsl[4], is(nullValue()));
    }
}