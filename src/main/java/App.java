import models.Animal;
import models.Sightings;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {static int getHerokuAssignedPort() {
ProcessBuilder processBuilder = new ProcessBuilder();
    if (processBuilder.environment().get("PORT") != null) {
        return Integer.parseInt(processBuilder.environment().get("PORT"));
    }
    return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
}
    public static void main(String[] args) {
        port(getHerokuAssignedPort());
        staticFileLocation("/public");


        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/animal", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("Animal", Animal.getAnimals());
            return new ModelAndView(model, "animal.hbs");
        }, new HandlebarsTemplateEngine());

        post("/create/animal/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            int id = Integer.parseInt(request.queryParams("id"));
            String animalName = request.queryParams("animalName");
            String animalType = request.queryParams("animalType");
            String age = request.queryParams("age");
            String health = request.queryParams("health");
            String createdBy = request.queryParams("createdBy");

            //sightings
            int animalId = Animal.findAnimalById(id);
            String rangerName = request.queryParams("ranger");
            String location = request.queryParams("location");
            String date = request.queryParams("date");


            String type = new String();
            if (type.equals("animal")) {
                Animal animal = new Animal(animalName, animalType, age, health, createdBy, date);
                animal.save();
            } else if (type.equals("sightings")) {
                Sightings newSightings = new Sightings(animalId, rangerName, location, health, 3 / 31 / 2019);
                newSightings.save();
            };
//            response.redirect("/Sightings");
            return null;


        }, new HandlebarsTemplateEngine());

        get("/sightings", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            List Sightings = models.Sightings.getAll();
            model.put("sightings", Sightings);
            return new ModelAndView(model, "sightings.hbs");
        }, new HandlebarsTemplateEngine());

    }



}