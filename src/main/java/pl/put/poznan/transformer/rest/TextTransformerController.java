package pl.put.poznan.transformer.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.transformer.logic.TextTransformer;

import java.util.Arrays;


@RestController
@RequestMapping("/{text}")
public class TextTransformerController {

    private static final Logger logger = LoggerFactory.getLogger(TextTransformerController.class);

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public String get(@PathVariable String text,
                              @RequestParam(value="operations", defaultValue="upper") String operations) {

        // log the parameters
//        logger.debug(text);
//        logger.debug(operations);

        // perform the transformation, you should run your logic here, below is just a silly example
        String[] todo = operations.split(";");
        try {
            TextTransformer transformer = new TextTransformer(todo);
            text = transformer.transform(text);
        }
        catch(Exception ex){
            System.out.println("ERROR!");
        }

        return text;
    }

//    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
//    public String post(@PathVariable String text,
//                      @RequestBody String[] transforms) {
//
//        // log the parameters
//        logger.debug(text);
//        logger.debug(operations);
//
//        // perform the transformation, you should run your logic here, below is just a silly example
//        TextTransformer transformer = new TextTransformer(transforms);
//        return transformer.transform(text);
//    }

}


