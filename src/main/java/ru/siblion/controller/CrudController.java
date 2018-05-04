package ru.siblion.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.siblion.entity.Item;

@RestController
@RequestMapping("/item")
public class CrudController {

    private Item item = new Item();

    @RequestMapping(method=RequestMethod.POST)
    public void createItem(
            @RequestParam int price,
            @RequestParam String name,
            @RequestParam int weight) {
        item.setWeight(weight);
        item.setPrice(price);
        item.setName(name);

    }

    @RequestMapping(
            method=RequestMethod.GET,
            produces="application/xml")
    public Item getItem() {
        item.setWeight(222);
        item.setPrice(24213);
        item.setName("string");
            return item;
    }

    @RequestMapping(method=RequestMethod.DELETE)
    public void deleteItem(int id) {

    }
}
