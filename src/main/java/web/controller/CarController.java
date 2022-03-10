package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;


@Controller
public class CarController {

    @Autowired
    private CarServiceImp carServiceImp;

    @GetMapping(value = "/cars")
    public String printCarTable(@RequestParam (value = "count", required = false) String numOfCar, ModelMap model) {
        model.addAttribute("cars", carServiceImp.getCars(numOfCar));
        return "car";
    }

}
