import dao.AnimalDao;
import dao.SightingsDao;
import models.Animal;
import models.Sightings;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {

        staticFileLocation("/public");


        get("/",(request, response) -> {
            Map<String, Object> model = new HashMap<>();
            List<Sightings> sightings = SightingsDao.getAllSightings();
            model.put("sightings",sightings);
            List<Animal> animal = AnimalDao.getAllAnimal();
            model.put("animal",animal);
            return new ModelAndView(model,"index.hbs");
        },new HandlebarsTemplateEngine());

        get("/sightings/new",(request,response)->{
            Map<String, Object>model = new HashMap<>();
            List<Sightings>squads = SightingsDao.getAllSightings();
            Object sightings = new Object();
            model.put("sightings",sightings);
            return new ModelAndView(model,"sightings.hbs");
        },new HandlebarsTemplateEngine());

        post("/sightings",(request,response)->{
            Map<String, Object>model = new HashMap<>();
            int animalId = Integer.parseInt(request.queryParams("animalId"));
            String endangeredAnimal = request.queryParams("endangeredAnimal");
            String location = request.queryParams("location");
            String rangerName = request.queryParams("rangerName");

            int createdAt = Integer.parseInt(request.queryParams("createdAt"));

            Sightings newSightings = new Sightings(animalId,endangeredAnimal,location,rangerName,createdAt);
            SightingsDao sightingsDao = null;
            sightingsDao.addSightings(newSightings);
            response.redirect("/");
            return null;
        },new HandlebarsTemplateEngine());

        get("/sightings/delete",(request, response)->{
            Map<String,Object>model = new HashMap<>();
            Object animalDao = null;
            animalDao.toString();
            SightingsDao sightingsDao = null;
            sightingsDao.deleteAllSightings();
            response.redirect("/");
            return null;
        },new HandlebarsTemplateEngine());


        get("/sightings/:animalId/delete",(request, response)->{
            Map<String, Object>model = new HashMap<>();
            int idOfSightingsToDelete = Integer.parseInt(request.params("animalId"));
            String idOfAnimalIdToDelete = new String();
            SightingsDao.deleteSightingsById(idOfAnimalIdToDelete,idOfSightingsToDelete);
            response.redirect("/");
            return null;
        }, new HandlebarsTemplateEngine());


        get("/animal/delete",(request, response)->{
            Map<String,Object>model = new HashMap<>();
            AnimalDao.deleteAllAnimals();
            response.redirect("/");
            return null;
        },new HandlebarsTemplateEngine());

        
        get("/sightings/:id",(request,response)->{
            Map<String,Object>model = new HashMap<>();
            int squadToFindId = Integer.parseInt(request.params("id"));
            int SightingsToFindId = Integer.parseInt(request.params("id"));
            Sightings foundSightings = SightingsDao.findSightingsById(SightingsToFindId);
            model.put("sightings",foundSightings);
            Object animalType = new Object();
            List<Animal>allAnimalsBySightings = new ArrayList();SightingsDao.getAnimalIdsBySightings(SightingsToFindId, animalType);
            model.put("animal",allAnimalsBySightings);
            model.put("sightings",SightingsDao.getAllSightings());
            return new ModelAndView(model,"sightings.hbs");
        }, new HandlebarsTemplateEngine());

        
        get("sightings/:animalId/Animal/:id/delete",(request, response)->{
            Map<String,Object>model = new HashMap<>();
            int idOfAnimalToDelete = Integer.parseInt(request.params("id"));
            int idOfAnimalToDeleteToDelete = Integer.parseInt(request.params("id"));
            AnimalDao.deleteAnimalById(idOfAnimalToDeleteToDelete);
            response.redirect("/");
            return null;
        },new HandlebarsTemplateEngine());

        
        get("/animal/new",(request,response)->{
            Map<String,Object>model = new HashMap<>();
            List<Sightings> sightings = SightingsDao.getAllSightings();
            model.put("sightings",sightings);
            return new ModelAndView(model,"animal.hbs");
        },new HandlebarsTemplateEngine());


        post("/animal",(request,response)->{
            Map<String,Object>model = new HashMap<>();
            String animalName = request.queryParams("animalName");
            String animalType = request.queryParams("animalType");;
            String age = request.queryParams("age");
            String health = request.queryParams("health"); 
            String createdBy = request.queryParams("createdBy");
            String createdAt = request.queryParams("createdAt");
            Animal newAnimal = new Animal(animalName,animalType,age,health,createdBy,createdAt);
            AnimalDao.addAnimal(newAnimal);
            response.redirect("/");
            return null;
        }, new HandlebarsTemplateEngine());


        get("sightings/:animalId/animal/:id",(request,response)->{
            Map<String,Object>model = new HashMap<>();
            int idd = Integer.parseInt(request.params("id"));
            Animal foundAnimal = AnimalDao.findAnimalById(idd);
            model.put("animal",foundAnimal);
            int AnimalId = Integer.parseInt(request.params("animalId"));
            Sightings foundSightings = SightingsDao.findSightingsById(AnimalId);
            model.put("sightings",foundSightings);
            model.put("sightings",SightingsDao.getAllSightings());
            return new ModelAndView(model,"hero-details.hbs");
        },new HandlebarsTemplateEngine());



    }





}
