package com.sarracent.springboot.di.app;

import com.sarracent.springboot.di.app.models.domain.ItemFactura;
import com.sarracent.springboot.di.app.models.domain.Producto;
import com.sarracent.springboot.di.app.models.service.IServicio;
import com.sarracent.springboot.di.app.models.service.MiServicio;
import com.sarracent.springboot.di.app.models.service.MiServicioComplejo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

//Cuando queremos inyectar clases de 3ros
@Configuration
public class AppConfig {

    @Bean("miServicioSimple")
    public IServicio registrarMiServicio(){
        return new MiServicio();
    }

    @Primary
    @Bean("miServicioComplejo")
    public IServicio registrarMiServicioComplejo(){
        return new MiServicioComplejo();
    }

    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems() {

        Producto producto1 = new Producto("Pan", 20);
        Producto producto2 = new Producto("carne", 100);

        ItemFactura linea1 = new ItemFactura(producto1, 4);
        ItemFactura linea2 = new ItemFactura(producto2, 2);

        return Arrays.asList(linea1, linea2);
    }

    @Bean("itemsFacturaOficina")
    @Primary
    public List<ItemFactura> registrarItemsOficina() {

        Producto producto1 = new Producto("Monitos LG", 250);
        Producto producto2 = new Producto("Notebook Asus", 500);
        Producto producto3 = new Producto("Impresora HP", 80);
        Producto producto4 = new Producto("Escritorio Oficina", 300);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 1);
        ItemFactura linea3 = new ItemFactura(producto3, 1);
        ItemFactura linea4 = new ItemFactura(producto4, 1);

        return Arrays.asList(linea1, linea2, linea3, linea4);
    }

}
