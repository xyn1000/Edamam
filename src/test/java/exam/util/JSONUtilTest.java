package exam.util;

import com.alibaba.fastjson.JSONObject;
import exam.entity.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JSONUtilTest {


    @Test
    public void jsonToFood() {
        String tmp = "{\n" +
                "                \"foodId\": \"food_a8hs60uayl5icia1qe8qoba1kwp8\",\n" +
                "                \"label\": \"Pasta\",\n" +
                "                \"nutrients\": {\n" +
                "                    \"ENERC_KCAL\": 371.0,\n" +
                "                    \"PROCNT\": 13.04,\n" +
                "                    \"FAT\": 1.51,\n" +
                "                    \"CHOCDF\": 74.67,\n" +
                "                    \"FIBTG\": 3.2\n" +
                "                },\n" +
                "                \"category\": \"Generic foods\",\n" +
                "                \"categoryLabel\": \"food\",\n" +
                "                \"servingsPerContainer\": 1.51\n" +
                "            }";
        Food food = JSONUtil.jsonToFood(tmp);
        assertEquals("food_a8hs60uayl5icia1qe8qoba1kwp8",food.getFoodId());
        assertEquals("Pasta",food.getLabel());
        assertEquals(5,food.getNutrients().size());
        assertEquals("Generic foods",food.getCategory());
        assertEquals("food",food.getCategoryLabel());
    }

    @Test
    public void jsonHintsToFoods() {
        HintsWrapper hw = new HintsWrapper();
        String str = "{\n" +
                "    \"text\": \"pasta\",\n" +
                "    \"parsed\": [\n" +
                "        {\n" +
                "            \"food\": {\n" +
                "                \"foodId\": \"food_a8hs60uayl5icia1qe8qoba1kwp8\",\n" +
                "                \"label\": \"Pasta\",\n" +
                "                \"nutrients\": {\n" +
                "                    \"ENERC_KCAL\": 371.0,\n" +
                "                    \"PROCNT\": 13.04,\n" +
                "                    \"FAT\": 1.51,\n" +
                "                    \"CHOCDF\": 74.67,\n" +
                "                    \"FIBTG\": 3.2\n" +
                "                },\n" +
                "                \"category\": \"Generic foods\",\n" +
                "                \"categoryLabel\": \"food\",\n" +
                "                \"servingsPerContainer\": 1.51\n" +
                "            }\n" +
                "        }\n" +
                "    ],\n" +
                "    \"hints\": [\n" +
                "        {\n" +
                "            \"food\": {\n" +
                "                \"foodId\": \"food_a8hs60uayl5icia1qe8qoba1kwp8\",\n" +
                "                \"label\": \"Pasta\",\n" +
                "                \"nutrients\": {\n" +
                "                    \"ENERC_KCAL\": 371.0,\n" +
                "                    \"PROCNT\": 13.04,\n" +
                "                    \"FAT\": 1.51,\n" +
                "                    \"CHOCDF\": 74.67,\n" +
                "                    \"FIBTG\": 3.2\n" +
                "                },\n" +
                "                \"category\": \"Generic foods\",\n" +
                "                \"categoryLabel\": \"food\",\n" +
                "                \"servingsPerContainer\": 1.51\n" +
                "            },\n" +
                "            \"measures\": [\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                "                    \"label\": \"Whole\",\n" +
                "                    \"weight\": 16.8\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                "                    \"label\": \"Serving\",\n" +
                "                    \"weight\": 300.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_noodle\",\n" +
                "                    \"label\": \"Noodle\",\n" +
                "                    \"weight\": 25.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_sheet\",\n" +
                "                    \"label\": \"Sheet\",\n" +
                "                    \"weight\": 25.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_strip\",\n" +
                "                    \"label\": \"Strip\",\n" +
                "                    \"weight\": 25.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_shell\",\n" +
                "                    \"label\": \"Shell\",\n" +
                "                    \"weight\": 16.8\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_tube\",\n" +
                "                    \"label\": \"Tube\",\n" +
                "                    \"weight\": 16.8\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_box\",\n" +
                "                    \"label\": \"Box\",\n" +
                "                    \"weight\": 453.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_package\",\n" +
                "                    \"label\": \"Package\",\n" +
                "                    \"weight\": 453.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_packet\",\n" +
                "                    \"label\": \"Packet\",\n" +
                "                    \"weight\": 255.15\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                "                    \"label\": \"Gram\",\n" +
                "                    \"weight\": 1.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\n" +
                "                    \"label\": \"Ounce\",\n" +
                "                    \"weight\": 28.349523125\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\n" +
                "                    \"label\": \"Pound\",\n" +
                "                    \"weight\": 453.59237\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\n" +
                "                    \"label\": \"Kilogram\",\n" +
                "                    \"weight\": 1000.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_cup\",\n" +
                "                    \"label\": \"Cup\",\n" +
                "                    \"weight\": 105.0,\n" +
                "                    \"qualified\": [\n" +
                "                        {\n" +
                "                            \"qualifiers\": [\n" +
                "                                {\n" +
                "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_shaped\",\n" +
                "                                    \"label\": \"shaped\"\n" +
                "                                }\n" +
                "                            ],\n" +
                "                            \"weight\": 105.0\n" +
                "                        }\n" +
                "                    ]\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"food\": {\n" +
                "                \"foodId\": \"food_a8hs60uayl5icia1qe8qoba1kwp8\",\n" +
                "                \"label\": \"Pasta Lasagna\",\n" +
                "                \"nutrients\": {\n" +
                "                    \"ENERC_KCAL\": 371.0,\n" +
                "                    \"PROCNT\": 13.04,\n" +
                "                    \"FAT\": 1.51,\n" +
                "                    \"CHOCDF\": 74.67,\n" +
                "                    \"FIBTG\": 3.2\n" +
                "                },\n" +
                "                \"category\": \"Generic foods\",\n" +
                "                \"categoryLabel\": \"food\",\n" +
                "                \"servingsPerContainer\": 1.51\n" +
                "            },\n" +
                "            \"measures\": [\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                "                    \"label\": \"Whole\",\n" +
                "                    \"weight\": 16.8\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                "                    \"label\": \"Serving\",\n" +
                "                    \"weight\": 300.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_noodle\",\n" +
                "                    \"label\": \"Noodle\",\n" +
                "                    \"weight\": 25.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_sheet\",\n" +
                "                    \"label\": \"Sheet\",\n" +
                "                    \"weight\": 25.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_strip\",\n" +
                "                    \"label\": \"Strip\",\n" +
                "                    \"weight\": 25.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_shell\",\n" +
                "                    \"label\": \"Shell\",\n" +
                "                    \"weight\": 16.8\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_tube\",\n" +
                "                    \"label\": \"Tube\",\n" +
                "                    \"weight\": 16.8\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_box\",\n" +
                "                    \"label\": \"Box\",\n" +
                "                    \"weight\": 453.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_package\",\n" +
                "                    \"label\": \"Package\",\n" +
                "                    \"weight\": 453.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_packet\",\n" +
                "                    \"label\": \"Packet\",\n" +
                "                    \"weight\": 255.15\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                "                    \"label\": \"Gram\",\n" +
                "                    \"weight\": 1.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\n" +
                "                    \"label\": \"Ounce\",\n" +
                "                    \"weight\": 28.349523125\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\n" +
                "                    \"label\": \"Pound\",\n" +
                "                    \"weight\": 453.59237\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\n" +
                "                    \"label\": \"Kilogram\",\n" +
                "                    \"weight\": 1000.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_cup\",\n" +
                "                    \"label\": \"Cup\",\n" +
                "                    \"weight\": 105.0,\n" +
                "                    \"qualified\": [\n" +
                "                        {\n" +
                "                            \"qualifiers\": [\n" +
                "                                {\n" +
                "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_shaped\",\n" +
                "                                    \"label\": \"shaped\"\n" +
                "                                }\n" +
                "                            ],\n" +
                "                            \"weight\": 105.0\n" +
                "                        }\n" +
                "                    ]\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"food\": {\n" +
                "                \"foodId\": \"food_a8hs60uayl5icia1qe8qoba1kwp8\",\n" +
                "                \"label\": \"Bowtie Pasta\",\n" +
                "                \"nutrients\": {\n" +
                "                    \"ENERC_KCAL\": 371.0,\n" +
                "                    \"PROCNT\": 13.04,\n" +
                "                    \"FAT\": 1.51,\n" +
                "                    \"CHOCDF\": 74.67,\n" +
                "                    \"FIBTG\": 3.2\n" +
                "                },\n" +
                "                \"category\": \"Generic foods\",\n" +
                "                \"categoryLabel\": \"food\",\n" +
                "                \"servingsPerContainer\": 1.51\n" +
                "            },\n" +
                "            \"measures\": [\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                "                    \"label\": \"Whole\",\n" +
                "                    \"weight\": 16.8\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                "                    \"label\": \"Serving\",\n" +
                "                    \"weight\": 300.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_noodle\",\n" +
                "                    \"label\": \"Noodle\",\n" +
                "                    \"weight\": 25.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_sheet\",\n" +
                "                    \"label\": \"Sheet\",\n" +
                "                    \"weight\": 25.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_strip\",\n" +
                "                    \"label\": \"Strip\",\n" +
                "                    \"weight\": 25.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_shell\",\n" +
                "                    \"label\": \"Shell\",\n" +
                "                    \"weight\": 16.8\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_tube\",\n" +
                "                    \"label\": \"Tube\",\n" +
                "                    \"weight\": 16.8\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_box\",\n" +
                "                    \"label\": \"Box\",\n" +
                "                    \"weight\": 453.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_package\",\n" +
                "                    \"label\": \"Package\",\n" +
                "                    \"weight\": 453.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_packet\",\n" +
                "                    \"label\": \"Packet\",\n" +
                "                    \"weight\": 255.15\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                "                    \"label\": \"Gram\",\n" +
                "                    \"weight\": 1.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\n" +
                "                    \"label\": \"Ounce\",\n" +
                "                    \"weight\": 28.349523125\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\n" +
                "                    \"label\": \"Pound\",\n" +
                "                    \"weight\": 453.59237\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\n" +
                "                    \"label\": \"Kilogram\",\n" +
                "                    \"weight\": 1000.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_cup\",\n" +
                "                    \"label\": \"Cup\",\n" +
                "                    \"weight\": 105.0,\n" +
                "                    \"qualified\": [\n" +
                "                        {\n" +
                "                            \"qualifiers\": [\n" +
                "                                {\n" +
                "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_shaped\",\n" +
                "                                    \"label\": \"shaped\"\n" +
                "                                }\n" +
                "                            ],\n" +
                "                            \"weight\": 105.0\n" +
                "                        }\n" +
                "                    ]\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"food\": {\n" +
                "                \"foodId\": \"food_a0l3u5zapu7xw0a079owcacuhvbf\",\n" +
                "                \"label\": \"Corn Pasta\",\n" +
                "                \"nutrients\": {\n" +
                "                    \"ENERC_KCAL\": 357.0,\n" +
                "                    \"PROCNT\": 7.46,\n" +
                "                    \"FAT\": 2.08,\n" +
                "                    \"CHOCDF\": 79.26,\n" +
                "                    \"FIBTG\": 11.0\n" +
                "                },\n" +
                "                \"category\": \"Generic foods\",\n" +
                "                \"categoryLabel\": \"food\",\n" +
                "                \"image\": \"https://www.edamam.com/food-img/521/5216000df5c8c70cfdfe6b3efb55bf87.jpg\"\n" +
                "            },\n" +
                "            \"measures\": [\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                "                    \"label\": \"Gram\",\n" +
                "                    \"weight\": 1.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\n" +
                "                    \"label\": \"Ounce\",\n" +
                "                    \"weight\": 28.349523125\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\n" +
                "                    \"label\": \"Pound\",\n" +
                "                    \"weight\": 453.59237\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\n" +
                "                    \"label\": \"Kilogram\",\n" +
                "                    \"weight\": 1000.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_cup\",\n" +
                "                    \"label\": \"Cup\",\n" +
                "                    \"weight\": 105.0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"food\": {\n" +
                "                \"foodId\": \"food_abp2hivbz4bvnxbu8himgb0rgmvo\",\n" +
                "                \"label\": \"Fresh Pasta\",\n" +
                "                \"nutrients\": {\n" +
                "                    \"ENERC_KCAL\": 288.0,\n" +
                "                    \"PROCNT\": 11.31,\n" +
                "                    \"FAT\": 2.3,\n" +
                "                    \"CHOCDF\": 54.73\n" +
                "                },\n" +
                "                \"category\": \"Generic foods\",\n" +
                "                \"categoryLabel\": \"food\"\n" +
                "            },\n" +
                "            \"measures\": [\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                "                    \"label\": \"Whole\",\n" +
                "                    \"weight\": 25.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_sheet\",\n" +
                "                    \"label\": \"Sheet\",\n" +
                "                    \"weight\": 25.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_strip\",\n" +
                "                    \"label\": \"Strip\",\n" +
                "                    \"weight\": 25.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                "                    \"label\": \"Gram\",\n" +
                "                    \"weight\": 1.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\n" +
                "                    \"label\": \"Ounce\",\n" +
                "                    \"weight\": 28.349523125\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\n" +
                "                    \"label\": \"Pound\",\n" +
                "                    \"weight\": 453.59237\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\n" +
                "                    \"label\": \"Kilogram\",\n" +
                "                    \"weight\": 1000.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_cup\",\n" +
                "                    \"label\": \"Cup\",\n" +
                "                    \"weight\": 140.0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"food\": {\n" +
                "                \"foodId\": \"food_aefg3gqa71nrtpbhjfo3yb36kd81\",\n" +
                "                \"label\": \"Egg Pasta\",\n" +
                "                \"nutrients\": {\n" +
                "                    \"ENERC_KCAL\": 384.0,\n" +
                "                    \"PROCNT\": 14.16,\n" +
                "                    \"FAT\": 4.44,\n" +
                "                    \"CHOCDF\": 71.27,\n" +
                "                    \"FIBTG\": 3.3\n" +
                "                },\n" +
                "                \"category\": \"Generic foods\",\n" +
                "                \"categoryLabel\": \"food\",\n" +
                "                \"image\": \"https://www.edamam.com/food-img/800/800c9c0d7cef6b5474723682ffa2878d.jpg\",\n" +
                "                \"servingsPerContainer\": 1.7\n" +
                "            },\n" +
                "            \"measures\": [\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                "                    \"label\": \"Whole\",\n" +
                "                    \"weight\": 340.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                "                    \"label\": \"Serving\",\n" +
                "                    \"weight\": 200.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_stick\",\n" +
                "                    \"label\": \"Stick\",\n" +
                "                    \"weight\": 57.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_box\",\n" +
                "                    \"label\": \"Box\",\n" +
                "                    \"weight\": 340.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_container\",\n" +
                "                    \"label\": \"Container\",\n" +
                "                    \"weight\": 340.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_package\",\n" +
                "                    \"label\": \"Package\",\n" +
                "                    \"weight\": 340.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_packet\",\n" +
                "                    \"label\": \"Packet\",\n" +
                "                    \"weight\": 340.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                "                    \"label\": \"Gram\",\n" +
                "                    \"weight\": 1.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\n" +
                "                    \"label\": \"Ounce\",\n" +
                "                    \"weight\": 28.349523125\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\n" +
                "                    \"label\": \"Pound\",\n" +
                "                    \"weight\": 453.59237\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\n" +
                "                    \"label\": \"Kilogram\",\n" +
                "                    \"weight\": 1000.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_cup\",\n" +
                "                    \"label\": \"Cup\",\n" +
                "                    \"weight\": 38.0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"food\": {\n" +
                "                \"foodId\": \"food_bkwbi4gbu7k75ha7ad8eralgwvlk\",\n" +
                "                \"label\": \"Rice Pasta\",\n" +
                "                \"nutrients\": {\n" +
                "                    \"ENERC_KCAL\": 364.0,\n" +
                "                    \"PROCNT\": 5.95,\n" +
                "                    \"FAT\": 0.56,\n" +
                "                    \"CHOCDF\": 80.18,\n" +
                "                    \"FIBTG\": 1.6\n" +
                "                },\n" +
                "                \"category\": \"Generic foods\",\n" +
                "                \"categoryLabel\": \"food\",\n" +
                "                \"image\": \"https://www.edamam.com/food-img/a83/a831dd1f26c9e2d0bf9e01bf7d5c0f0e.jpg\"\n" +
                "            },\n" +
                "            \"measures\": [\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                "                    \"label\": \"Whole\",\n" +
                "                    \"weight\": 28.5\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_sheet\",\n" +
                "                    \"label\": \"Sheet\",\n" +
                "                    \"weight\": 28.5\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_box\",\n" +
                "                    \"label\": \"Box\",\n" +
                "                    \"weight\": 453.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_container\",\n" +
                "                    \"label\": \"Container\",\n" +
                "                    \"weight\": 453.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_package\",\n" +
                "                    \"label\": \"Package\",\n" +
                "                    \"weight\": 453.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_packet\",\n" +
                "                    \"label\": \"Packet\",\n" +
                "                    \"weight\": 453.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                "                    \"label\": \"Gram\",\n" +
                "                    \"weight\": 1.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\n" +
                "                    \"label\": \"Ounce\",\n" +
                "                    \"weight\": 28.349523125\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\n" +
                "                    \"label\": \"Pound\",\n" +
                "                    \"weight\": 453.59237\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\n" +
                "                    \"label\": \"Kilogram\",\n" +
                "                    \"weight\": 1000.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_handful\",\n" +
                "                    \"label\": \"Handful\",\n" +
                "                    \"weight\": 57.0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"food\": {\n" +
                "                \"foodId\": \"food_adywgu1aso5izzatjcyhxa86ieta\",\n" +
                "                \"label\": \"Spinach Pasta\",\n" +
                "                \"nutrients\": {\n" +
                "                    \"ENERC_KCAL\": 372.0,\n" +
                "                    \"PROCNT\": 13.35,\n" +
                "                    \"FAT\": 1.57,\n" +
                "                    \"CHOCDF\": 74.81,\n" +
                "                    \"FIBTG\": 10.6\n" +
                "                },\n" +
                "                \"category\": \"Generic foods\",\n" +
                "                \"categoryLabel\": \"food\",\n" +
                "                \"image\": \"https://www.edamam.com/food-img/b74/b74d0a397e89606349d705264acc0634.jpg\"\n" +
                "            },\n" +
                "            \"measures\": [\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                "                    \"label\": \"Gram\",\n" +
                "                    \"weight\": 1.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\n" +
                "                    \"label\": \"Ounce\",\n" +
                "                    \"weight\": 28.349523125\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\n" +
                "                    \"label\": \"Pound\",\n" +
                "                    \"weight\": 453.59237\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\n" +
                "                    \"label\": \"Kilogram\",\n" +
                "                    \"weight\": 1000.0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"food\": {\n" +
                "                \"foodId\": \"food_aet2nhrax3uc3ubfefw91b6w094y\",\n" +
                "                \"label\": \"Multigrain Pasta\",\n" +
                "                \"nutrients\": {\n" +
                "                    \"ENERC_KCAL\": 348.0,\n" +
                "                    \"PROCNT\": 14.63,\n" +
                "                    \"FAT\": 1.4,\n" +
                "                    \"CHOCDF\": 75.03\n" +
                "                },\n" +
                "                \"category\": \"Generic foods\",\n" +
                "                \"categoryLabel\": \"food\",\n" +
                "                \"image\": \"https://www.edamam.com/food-img/fe8/fe84b730ff869fbd68ee9eb598ed455c.jpg\"\n" +
                "            },\n" +
                "            \"measures\": [\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                "                    \"label\": \"Whole\",\n" +
                "                    \"weight\": 25.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_noodle\",\n" +
                "                    \"label\": \"Noodle\",\n" +
                "                    \"weight\": 25.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_box\",\n" +
                "                    \"label\": \"Box\",\n" +
                "                    \"weight\": 375.63\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                "                    \"label\": \"Gram\",\n" +
                "                    \"weight\": 1.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\n" +
                "                    \"label\": \"Ounce\",\n" +
                "                    \"weight\": 28.349523125\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\n" +
                "                    \"label\": \"Pound\",\n" +
                "                    \"weight\": 453.59237\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\n" +
                "                    \"label\": \"Kilogram\",\n" +
                "                    \"weight\": 1000.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_cup\",\n" +
                "                    \"label\": \"Cup\",\n" +
                "                    \"weight\": 93.0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"food\": {\n" +
                "                \"foodId\": \"food_b5zc4e5b2rpe0madtzy6pbw6dbyu\",\n" +
                "                \"label\": \"Fresh Spinach Pasta\",\n" +
                "                \"nutrients\": {\n" +
                "                    \"ENERC_KCAL\": 289.0,\n" +
                "                    \"PROCNT\": 11.26,\n" +
                "                    \"FAT\": 2.1,\n" +
                "                    \"CHOCDF\": 55.72\n" +
                "                },\n" +
                "                \"category\": \"Generic foods\",\n" +
                "                \"categoryLabel\": \"food\"\n" +
                "            },\n" +
                "            \"measures\": [\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                "                    \"label\": \"Gram\",\n" +
                "                    \"weight\": 1.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\n" +
                "                    \"label\": \"Ounce\",\n" +
                "                    \"weight\": 28.349523125\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\n" +
                "                    \"label\": \"Pound\",\n" +
                "                    \"weight\": 453.59237\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\n" +
                "                    \"label\": \"Kilogram\",\n" +
                "                    \"weight\": 1000.0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"food\": {\n" +
                "                \"foodId\": \"food_byabah0aq2x81fagpefcxb160e4i\",\n" +
                "                \"label\": \"Fresh Plain Cooked Pasta\",\n" +
                "                \"nutrients\": {\n" +
                "                    \"ENERC_KCAL\": 131.0,\n" +
                "                    \"PROCNT\": 5.15,\n" +
                "                    \"FAT\": 1.05,\n" +
                "                    \"CHOCDF\": 24.93\n" +
                "                },\n" +
                "                \"category\": \"Generic foods\",\n" +
                "                \"categoryLabel\": \"food\",\n" +
                "                \"image\": \"https://www.edamam.com/food-img/237/23777585817abfffec98de8bbb274e56.jpg\"\n" +
                "            },\n" +
                "            \"measures\": [\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                "                    \"label\": \"Serving\",\n" +
                "                    \"weight\": 100.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                "                    \"label\": \"Gram\",\n" +
                "                    \"weight\": 1.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\n" +
                "                    \"label\": \"Ounce\",\n" +
                "                    \"weight\": 28.349523125\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\n" +
                "                    \"label\": \"Pound\",\n" +
                "                    \"weight\": 453.59237\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\n" +
                "                    \"label\": \"Kilogram\",\n" +
                "                    \"weight\": 1000.0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"food\": {\n" +
                "                \"foodId\": \"food_bmtsza0a5s8mwxbb7bi5xbyjyoaq\",\n" +
                "                \"label\": \"Fresh Cooked Spinach Pasta\",\n" +
                "                \"nutrients\": {\n" +
                "                    \"ENERC_KCAL\": 130.0,\n" +
                "                    \"PROCNT\": 5.06,\n" +
                "                    \"FAT\": 0.94,\n" +
                "                    \"CHOCDF\": 25.04\n" +
                "                },\n" +
                "                \"category\": \"Generic foods\",\n" +
                "                \"categoryLabel\": \"food\",\n" +
                "                \"image\": \"https://www.edamam.com/food-img/320/3207b858887d809fdbac6ee98bbbe598.jpg\"\n" +
                "            },\n" +
                "            \"measures\": [\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                "                    \"label\": \"Serving\",\n" +
                "                    \"weight\": 50.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                "                    \"label\": \"Gram\",\n" +
                "                    \"weight\": 1.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\n" +
                "                    \"label\": \"Ounce\",\n" +
                "                    \"weight\": 28.349523125\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\n" +
                "                    \"label\": \"Pound\",\n" +
                "                    \"weight\": 453.59237\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\n" +
                "                    \"label\": \"Kilogram\",\n" +
                "                    \"weight\": 1000.0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"food\": {\n" +
                "                \"foodId\": \"food_aqa6f3pb2ns0w6asujtv0bu3vdgp\",\n" +
                "                \"label\": \"Pasta Roni  Pasta\",\n" +
                "                \"nutrients\": {\n" +
                "                    \"ENERC_KCAL\": 80.30830391687712,\n" +
                "                    \"PROCNT\": 2.9587269864112624,\n" +
                "                    \"FAT\": 0.845350567546075,\n" +
                "                    \"CHOCDF\": 16.061660783375423\n" +
                "                },\n" +
                "                \"brand\": \"Pasta Roni\",\n" +
                "                \"category\": \"Packaged foods\",\n" +
                "                \"categoryLabel\": \"food\",\n" +
                "                \"foodContentsLabel\": \"Wheat Flour; Whey; Partially Hydrogenated Palm Oil; Salt; Maltodextrin; Dried Corn Syrup; Natural Flavors; Corn Starch Modified; Dried Onions; Monosodium Glutamate; Dried Parsley; Dried Garlic; Sodium Caseinate; Spices; Soy Lecithin; Yellow 5; Ferrous Sulfate; Yellow 6 Lake; Niacin; Yellow 6; Thiamin Mononitrate; Riboflavin; Folic Acid.\",\n" +
                "                \"image\": \"https://www.edamam.com/food-img/436/436c6468d45d9ef12e0c83af67f1e60f.jpg\",\n" +
                "                \"servingSizes\": [\n" +
                "                    {\n" +
                "                        \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_cup\",\n" +
                "                        \"label\": \"Cup\",\n" +
                "                        \"quantity\": 1.0\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"servingsPerContainer\": 1.0\n" +
                "            },\n" +
                "            \"measures\": [\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                "                    \"label\": \"Serving\",\n" +
                "                    \"weight\": 236.5882365\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_package\",\n" +
                "                    \"label\": \"Package\",\n" +
                "                    \"weight\": 591.47059125\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                "                    \"label\": \"Gram\",\n" +
                "                    \"weight\": 1.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\n" +
                "                    \"label\": \"Ounce\",\n" +
                "                    \"weight\": 28.349523125\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\n" +
                "                    \"label\": \"Pound\",\n" +
                "                    \"weight\": 453.59237\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\n" +
                "                    \"label\": \"Kilogram\",\n" +
                "                    \"weight\": 1000.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_cup\",\n" +
                "                    \"label\": \"Cup\",\n" +
                "                    \"weight\": 236.5882365\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"food\": {\n" +
                "                \"foodId\": \"food_aygy93xbs4eiuga5p1c4jb4oyth6\",\n" +
                "                \"label\": \"Pasta Roni  Pasta\",\n" +
                "                \"nutrients\": {\n" +
                "                    \"ENERC_KCAL\": 352.7396194958041,\n" +
                "                    \"PROCNT\": 12.345886682353145,\n" +
                "                    \"FAT\": 6.172943341176572,\n" +
                "                    \"CHOCDF\": 63.49313150924474\n" +
                "                },\n" +
                "                \"brand\": \"Pasta Roni\",\n" +
                "                \"category\": \"Packaged foods\",\n" +
                "                \"categoryLabel\": \"food\",\n" +
                "                \"foodContentsLabel\": \"Wheat Flour; Partially Hydrogenated Palm Oil; Salt; Whey; Reduced Lactose Whey; Dried Corn Syrup; Natural Flavors; Palm Oil; Monosodium Glutamate; Cultured Nonfat Buttermilk; Parmesan Cheese ( Cow's Milk; Cheese Cultures; Salt; Enzymes ); Sodium Caseinate; Modified Corn Starch; Dried Parsley; Nonfat Milk; Dried Onions; Spices; Lactic Acid; Ferrous Sulfate; Niacin; Soy Lecithin; Yellow 5; Yellow 6 Lakes; Yellow 6; Thiamin Mononitrate; Riboflavin; Folic Acid.\",\n" +
                "                \"image\": \"https://www.edamam.com/food-img/d17/d17321dec7b6cb6c8a64ecec02bae968.jpg\",\n" +
                "                \"servingSizes\": [\n" +
                "                    {\n" +
                "                        \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\n" +
                "                        \"label\": \"Ounce\",\n" +
                "                        \"quantity\": 2.0\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"servingsPerContainer\": 1.0\n" +
                "            },\n" +
                "            \"measures\": [\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                "                    \"label\": \"Serving\",\n" +
                "                    \"weight\": 56.69904625\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_package\",\n" +
                "                    \"label\": \"Package\",\n" +
                "                    \"weight\": 141.747615625\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                "                    \"label\": \"Gram\",\n" +
                "                    \"weight\": 1.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\n" +
                "                    \"label\": \"Ounce\",\n" +
                "                    \"weight\": 28.349523125\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\n" +
                "                    \"label\": \"Pound\",\n" +
                "                    \"weight\": 453.59237\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\n" +
                "                    \"label\": \"Kilogram\",\n" +
                "                    \"weight\": 1000.0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"food\": {\n" +
                "                \"foodId\": \"food_bcwokz3b2oo23xbi9zcjiav8mo2n\",\n" +
                "                \"label\": \"Cooked Pasta\",\n" +
                "                \"nutrients\": {\n" +
                "                    \"ENERC_KCAL\": 158.0,\n" +
                "                    \"PROCNT\": 5.8,\n" +
                "                    \"FAT\": 0.93,\n" +
                "                    \"CHOCDF\": 30.86,\n" +
                "                    \"FIBTG\": 1.8\n" +
                "                },\n" +
                "                \"category\": \"Generic foods\",\n" +
                "                \"categoryLabel\": \"food\",\n" +
                "                \"servingsPerContainer\": 0.8571428571428571\n" +
                "            },\n" +
                "            \"measures\": [\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                "                    \"label\": \"Whole\",\n" +
                "                    \"weight\": 33.75\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                "                    \"label\": \"Serving\",\n" +
                "                    \"weight\": 280.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_pouch\",\n" +
                "                    \"label\": \"Pouch\",\n" +
                "                    \"weight\": 240.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_noodle\",\n" +
                "                    \"label\": \"Noodle\",\n" +
                "                    \"weight\": 33.75\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_sheet\",\n" +
                "                    \"label\": \"Sheet\",\n" +
                "                    \"weight\": 33.75\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_strip\",\n" +
                "                    \"label\": \"Strip\",\n" +
                "                    \"weight\": 33.75\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_shell\",\n" +
                "                    \"label\": \"Shell\",\n" +
                "                    \"weight\": 22.68\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_tube\",\n" +
                "                    \"label\": \"Tube\",\n" +
                "                    \"weight\": 22.68\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_package\",\n" +
                "                    \"label\": \"Package\",\n" +
                "                    \"weight\": 240.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_packet\",\n" +
                "                    \"label\": \"Packet\",\n" +
                "                    \"weight\": 240.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                "                    \"label\": \"Gram\",\n" +
                "                    \"weight\": 1.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\n" +
                "                    \"label\": \"Ounce\",\n" +
                "                    \"weight\": 28.349523125\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\n" +
                "                    \"label\": \"Pound\",\n" +
                "                    \"weight\": 453.59237\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\n" +
                "                    \"label\": \"Kilogram\",\n" +
                "                    \"weight\": 1000.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_cup\",\n" +
                "                    \"label\": \"Cup\",\n" +
                "                    \"weight\": 140.0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"food\": {\n" +
                "                \"foodId\": \"food_aanfrx8a7w5kgcb3856ezajplx0z\",\n" +
                "                \"label\": \"Pasta With Meatballs\",\n" +
                "                \"nutrients\": {\n" +
                "                    \"ENERC_KCAL\": 151.53910743806026,\n" +
                "                    \"PROCNT\": 6.786600500240953,\n" +
                "                    \"FAT\": 5.507199700357611,\n" +
                "                    \"CHOCDF\": 18.539790069877665,\n" +
                "                    \"FIBTG\": 1.6535280777025392\n" +
                "                },\n" +
                "                \"category\": \"Generic meals\",\n" +
                "                \"categoryLabel\": \"meal\",\n" +
                "                \"foodContentsLabel\": \"fresh breadcrumbs; milk; egg; fresh basil; Parmesan cheese; garlic; kosher salt; black pepper; ground pork; pasta; olive oil; squash; zucchini; pasta sauce; can diced tomatoes\"\n" +
                "            },\n" +
                "            \"measures\": [\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                "                    \"label\": \"Whole\",\n" +
                "                    \"weight\": 654.7609255208641\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                "                    \"label\": \"Serving\",\n" +
                "                    \"weight\": 654.7609255208641\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                "                    \"label\": \"Gram\",\n" +
                "                    \"weight\": 1.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\n" +
                "                    \"label\": \"Ounce\",\n" +
                "                    \"weight\": 28.349523125\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\n" +
                "                    \"label\": \"Pound\",\n" +
                "                    \"weight\": 453.59237\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\n" +
                "                    \"label\": \"Kilogram\",\n" +
                "                    \"weight\": 1000.0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"food\": {\n" +
                "                \"foodId\": \"food_b2ykg3qb1xl7r3bjk3rrgbqhlikz\",\n" +
                "                \"label\": \"Pasta Lasagna\",\n" +
                "                \"nutrients\": {\n" +
                "                    \"ENERC_KCAL\": 169.0263778119147,\n" +
                "                    \"PROCNT\": 10.329158408363133,\n" +
                "                    \"FAT\": 8.33234569838849,\n" +
                "                    \"CHOCDF\": 12.779721386749664,\n" +
                "                    \"FIBTG\": 1.072381773633119\n" +
                "                },\n" +
                "                \"category\": \"Generic meals\",\n" +
                "                \"categoryLabel\": \"meal\",\n" +
                "                \"foodContentsLabel\": \"pasta; lean ground beef; pasta sauce; egg; ricotta cheese; mozzarella cheese; Parmesan cheese\"\n" +
                "            },\n" +
                "            \"measures\": [\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                "                    \"label\": \"Whole\",\n" +
                "                    \"weight\": 382.793800625\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                "                    \"label\": \"Serving\",\n" +
                "                    \"weight\": 382.793800625\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                "                    \"label\": \"Gram\",\n" +
                "                    \"weight\": 1.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\n" +
                "                    \"label\": \"Ounce\",\n" +
                "                    \"weight\": 28.349523125\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\n" +
                "                    \"label\": \"Pound\",\n" +
                "                    \"weight\": 453.59237\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\n" +
                "                    \"label\": \"Kilogram\",\n" +
                "                    \"weight\": 1000.0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"food\": {\n" +
                "                \"foodId\": \"food_asnkv3rbli5r59axoseadaraqu40\",\n" +
                "                \"label\": \"Pasta Skillet\",\n" +
                "                \"nutrients\": {\n" +
                "                    \"ENERC_KCAL\": 148.45746480804326,\n" +
                "                    \"PROCNT\": 7.93473123657124,\n" +
                "                    \"FAT\": 6.971915204635109,\n" +
                "                    \"CHOCDF\": 12.985627910703434,\n" +
                "                    \"FIBTG\": 0.9935704300330579\n" +
                "                },\n" +
                "                \"category\": \"Generic meals\",\n" +
                "                \"categoryLabel\": \"meal\",\n" +
                "                \"foodContentsLabel\": \"ground beef; water; mostaccioli; Pasta Sauce; Mozzarella Cheese; Parmesan Cheese\"\n" +
                "            },\n" +
                "            \"measures\": [\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                "                    \"label\": \"Whole\",\n" +
                "                    \"weight\": 374.52459861111106\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                "                    \"label\": \"Serving\",\n" +
                "                    \"weight\": 374.52459861111106\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                "                    \"label\": \"Gram\",\n" +
                "                    \"weight\": 1.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\n" +
                "                    \"label\": \"Ounce\",\n" +
                "                    \"weight\": 28.349523125\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\n" +
                "                    \"label\": \"Pound\",\n" +
                "                    \"weight\": 453.59237\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\n" +
                "                    \"label\": \"Kilogram\",\n" +
                "                    \"weight\": 1000.0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"food\": {\n" +
                "                \"foodId\": \"food_byikq8da6qbu84a7ym2nharafmny\",\n" +
                "                \"label\": \"Pizza Pasta\",\n" +
                "                \"nutrients\": {\n" +
                "                    \"ENERC_KCAL\": 164.4615391025732,\n" +
                "                    \"PROCNT\": 10.526742465857541,\n" +
                "                    \"FAT\": 7.6476185902712865,\n" +
                "                    \"CHOCDF\": 12.874664452361928,\n" +
                "                    \"FIBTG\": 1.2083312212931892\n" +
                "                },\n" +
                "                \"category\": \"Generic meals\",\n" +
                "                \"categoryLabel\": \"meal\",\n" +
                "                \"foodContentsLabel\": \"rotini pasta; lean ground beef; onion; spaghetti sauce; sausage; mozzarella cheese\"\n" +
                "            },\n" +
                "            \"measures\": [\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                "                    \"label\": \"Whole\",\n" +
                "                    \"weight\": 313.5955491666667\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                "                    \"label\": \"Serving\",\n" +
                "                    \"weight\": 313.5955491666667\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                "                    \"label\": \"Gram\",\n" +
                "                    \"weight\": 1.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\n" +
                "                    \"label\": \"Ounce\",\n" +
                "                    \"weight\": 28.349523125\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\n" +
                "                    \"label\": \"Pound\",\n" +
                "                    \"weight\": 453.59237\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\n" +
                "                    \"label\": \"Kilogram\",\n" +
                "                    \"weight\": 1000.0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"food\": {\n" +
                "                \"foodId\": \"food_awoscbwb73h87day0c4h6btx6juh\",\n" +
                "                \"label\": \"Garlic Pasta\",\n" +
                "                \"nutrients\": {\n" +
                "                    \"ENERC_KCAL\": 344.24559105224637,\n" +
                "                    \"PROCNT\": 10.416968165110077,\n" +
                "                    \"FAT\": 10.172490734137778,\n" +
                "                    \"CHOCDF\": 52.396866681421976,\n" +
                "                    \"FIBTG\": 2.659094580382524\n" +
                "                },\n" +
                "                \"category\": \"Generic meals\",\n" +
                "                \"categoryLabel\": \"meal\",\n" +
                "                \"foodContentsLabel\": \"pasta; olive oil; butter; onion; garlic; granulated garlic; salt; pepper; italian seasoning; cooked pasta; lemon; cheese\"\n" +
                "            },\n" +
                "            \"measures\": [\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                "                    \"label\": \"Whole\",\n" +
                "                    \"weight\": 132.31540336913713\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                "                    \"label\": \"Serving\",\n" +
                "                    \"weight\": 132.31540336913713\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                "                    \"label\": \"Gram\",\n" +
                "                    \"weight\": 1.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\n" +
                "                    \"label\": \"Ounce\",\n" +
                "                    \"weight\": 28.349523125\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\n" +
                "                    \"label\": \"Pound\",\n" +
                "                    \"weight\": 453.59237\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\n" +
                "                    \"label\": \"Kilogram\",\n" +
                "                    \"weight\": 1000.0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"food\": {\n" +
                "                \"foodId\": \"food_b6ok1m1a1uf2g1bc5wci1alr2t0u\",\n" +
                "                \"label\": \"Chicken Pasta\",\n" +
                "                \"nutrients\": {\n" +
                "                    \"ENERC_KCAL\": 118.44392353571969,\n" +
                "                    \"PROCNT\": 4.156471547453407,\n" +
                "                    \"FAT\": 4.234591933496992,\n" +
                "                    \"CHOCDF\": 16.416513998068012,\n" +
                "                    \"FIBTG\": 2.1146370428139702\n" +
                "                },\n" +
                "                \"category\": \"Generic meals\",\n" +
                "                \"categoryLabel\": \"meal\",\n" +
                "                \"foodContentsLabel\": \"evoo; can tomatoes; garlic; pasta; black olives; mozzerella; fresh basil; cooked chicken\"\n" +
                "            },\n" +
                "            \"measures\": [\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                "                    \"label\": \"Whole\",\n" +
                "                    \"weight\": 626.8722222222221\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                "                    \"label\": \"Serving\",\n" +
                "                    \"weight\": 626.8722222222221\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                "                    \"label\": \"Gram\",\n" +
                "                    \"weight\": 1.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\n" +
                "                    \"label\": \"Ounce\",\n" +
                "                    \"weight\": 28.349523125\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\n" +
                "                    \"label\": \"Pound\",\n" +
                "                    \"weight\": 453.59237\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\n" +
                "                    \"label\": \"Kilogram\",\n" +
                "                    \"weight\": 1000.0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"food\": {\n" +
                "                \"foodId\": \"food_bnjwsjybqqeyx8b757xv0au2afuy\",\n" +
                "                \"label\": \"Pasta Arrabiata\",\n" +
                "                \"nutrients\": {\n" +
                "                    \"ENERC_KCAL\": 89.3328502932735,\n" +
                "                    \"PROCNT\": 2.871112958756116,\n" +
                "                    \"FAT\": 1.7588554909294527,\n" +
                "                    \"CHOCDF\": 15.971546219507193,\n" +
                "                    \"FIBTG\": 1.6338749322334574\n" +
                "                },\n" +
                "                \"category\": \"Generic meals\",\n" +
                "                \"categoryLabel\": \"meal\",\n" +
                "                \"foodContentsLabel\": \"pasta; onion; tomatoes; garlic; chilli flakes; oregano; dried basil; salt; olive oil; parmesan cheese\"\n" +
                "            },\n" +
                "            \"measures\": [\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                "                    \"label\": \"Whole\",\n" +
                "                    \"weight\": 502.30512373304606\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                "                    \"label\": \"Serving\",\n" +
                "                    \"weight\": 502.30512373304606\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                "                    \"label\": \"Gram\",\n" +
                "                    \"weight\": 1.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_ounce\",\n" +
                "                    \"label\": \"Ounce\",\n" +
                "                    \"weight\": 28.349523125\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_pound\",\n" +
                "                    \"label\": \"Pound\",\n" +
                "                    \"weight\": 453.59237\n" +
                "                },\n" +
                "                {\n" +
                "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\n" +
                "                    \"label\": \"Kilogram\",\n" +
                "                    \"weight\": 1000.0\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ],\n" +
                "    \"_links\": {\n" +
                "        \"next\": {\n" +
                "            \"title\": \"Next page\",\n" +
                "            \"href\": \"https://api.edamam.com/api/food-database/v2/parser?session=44&ingr=pasta&app_id=392a8fb6&app_key=028f5ddf7a61e1ef057fe3cb38a4e5ab\"\n" +
                "        }\n" +
                "    }\n" +
                "}";
        JSONUtil.jsonHintsToFoods(hw,str);
        assertEquals("pasta",hw.getText());
        assertEquals(22,hw.getHintsList().size());
        assertEquals("food_a8hs60uayl5icia1qe8qoba1kwp8",hw.getHintsList().get(0).getFood().getFoodId());
        assertEquals("Generic foods",hw.getHintsList().get(0).getFood().getCategory());
        assertEquals("food",hw.getHintsList().get(0).getFood().getCategoryLabel());
    }

    @Test
    public void getIngredientJSON() {
        Ingredient tmp = new Ingredient();
        tmp.setMeasureURI("fakeURI");
        tmp.setQuantity(1.0);
        tmp.setFoodId("foodidHERE");
        JSONObject obj=JSONUtil.getIngredientJSON(tmp);
        String expect = "{\"ingredients\":[{\"quantity\":1.0,\"foodId\":\"foodidHERE\",\"measureURI\":\"fakeURI\"}]}";
        assertEquals(expect,obj.toJSONString());
    }

    @Test
    public void jsonToNutrientWrapperTest(){
        String str ="{\n" +
                "    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#3b66ba29-954d-42b0-ba85-0ee170150a8e\",\n" +
                "    \"calories\": 94,\n" +
                "    \"totalWeight\": 182.0,\n" +
                "    \"dietLabels\": [],\n" +
                "    \"healthLabels\": [\n" +
                "        \"FAT_FREE\",\n" +
                "        \"VEGAN\",\n" +
                "        \"VEGETARIAN\",\n" +
                "        \"PESCATARIAN\",\n" +
                "        \"PALEO\",\n" +
                "        \"SPECIFIC_CARBS\",\n" +
                "        \"DAIRY_FREE\",\n" +
                "        \"GLUTEN_FREE\",\n" +
                "        \"WHEAT_FREE\",\n" +
                "        \"EGG_FREE\",\n" +
                "        \"MILK_FREE\",\n" +
                "        \"PEANUT_FREE\",\n" +
                "        \"TREE_NUT_FREE\",\n" +
                "        \"SOY_FREE\",\n" +
                "        \"FISH_FREE\",\n" +
                "        \"SHELLFISH_FREE\",\n" +
                "        \"PORK_FREE\",\n" +
                "        \"RED_MEAT_FREE\",\n" +
                "        \"CRUSTACEAN_FREE\",\n" +
                "        \"CELERY_FREE\",\n" +
                "        \"MUSTARD_FREE\",\n" +
                "        \"SESAME_FREE\",\n" +
                "        \"LUPINE_FREE\",\n" +
                "        \"MOLLUSK_FREE\",\n" +
                "        \"ALCOHOL_FREE\",\n" +
                "        \"NO_OIL_ADDED\",\n" +
                "        \"NO_SUGAR_ADDED\",\n" +
                "        \"KOSHER\"\n" +
                "    ],\n" +
                "    \"cautions\": [\n" +
                "        \"SULFITES\"\n" +
                "    ],\n" +
                "    \"totalNutrients\": {\n" +
                "        \"ENERC_KCAL\": {\n" +
                "            \"label\": \"Energy\",\n" +
                "            \"quantity\": 94.64,\n" +
                "            \"unit\": \"kcal\"\n" +
                "        },\n" +
                "        \"FAT\": {\n" +
                "            \"label\": \"Fat\",\n" +
                "            \"quantity\": 0.3094,\n" +
                "            \"unit\": \"g\"\n" +
                "        },\n" +
                "        \"FASAT\": {\n" +
                "            \"label\": \"Saturated\",\n" +
                "            \"quantity\": 0.050960000000000005,\n" +
                "            \"unit\": \"g\"\n" +
                "        },\n" +
                "        \"FAMS\": {\n" +
                "            \"label\": \"Monounsaturated\",\n" +
                "            \"quantity\": 0.012740000000000001,\n" +
                "            \"unit\": \"g\"\n" +
                "        },\n" +
                "        \"FAPU\": {\n" +
                "            \"label\": \"Polyunsaturated\",\n" +
                "            \"quantity\": 0.09282,\n" +
                "            \"unit\": \"g\"\n" +
                "        },\n" +
                "        \"CHOCDF\": {\n" +
                "            \"label\": \"Carbs\",\n" +
                "            \"quantity\": 25.134200000000003,\n" +
                "            \"unit\": \"g\"\n" +
                "        },\n" +
                "        \"FIBTG\": {\n" +
                "            \"label\": \"Fiber\",\n" +
                "            \"quantity\": 4.368,\n" +
                "            \"unit\": \"g\"\n" +
                "        },\n" +
                "        \"SUGAR\": {\n" +
                "            \"label\": \"Sugars\",\n" +
                "            \"quantity\": 18.9098,\n" +
                "            \"unit\": \"g\"\n" +
                "        },\n" +
                "        \"PROCNT\": {\n" +
                "            \"label\": \"Protein\",\n" +
                "            \"quantity\": 0.4732,\n" +
                "            \"unit\": \"g\"\n" +
                "        },\n" +
                "        \"CHOLE\": {\n" +
                "            \"label\": \"Cholesterol\",\n" +
                "            \"quantity\": 0.0,\n" +
                "            \"unit\": \"mg\"\n" +
                "        },\n" +
                "        \"NA\": {\n" +
                "            \"label\": \"Sodium\",\n" +
                "            \"quantity\": 1.82,\n" +
                "            \"unit\": \"mg\"\n" +
                "        },\n" +
                "        \"CA\": {\n" +
                "            \"label\": \"Calcium\",\n" +
                "            \"quantity\": 10.92,\n" +
                "            \"unit\": \"mg\"\n" +
                "        },\n" +
                "        \"MG\": {\n" +
                "            \"label\": \"Magnesium\",\n" +
                "            \"quantity\": 9.1,\n" +
                "            \"unit\": \"mg\"\n" +
                "        },\n" +
                "        \"K\": {\n" +
                "            \"label\": \"Potassium\",\n" +
                "            \"quantity\": 194.74,\n" +
                "            \"unit\": \"mg\"\n" +
                "        },\n" +
                "        \"FE\": {\n" +
                "            \"label\": \"Iron\",\n" +
                "            \"quantity\": 0.2184,\n" +
                "            \"unit\": \"mg\"\n" +
                "        },\n" +
                "        \"ZN\": {\n" +
                "            \"label\": \"Zinc\",\n" +
                "            \"quantity\": 0.0728,\n" +
                "            \"unit\": \"mg\"\n" +
                "        },\n" +
                "        \"P\": {\n" +
                "            \"label\": \"Phosphorus\",\n" +
                "            \"quantity\": 20.02,\n" +
                "            \"unit\": \"mg\"\n" +
                "        },\n" +
                "        \"VITA_RAE\": {\n" +
                "            \"label\": \"Vitamin A\",\n" +
                "            \"quantity\": 5.46,\n" +
                "            \"unit\": \"µg\"\n" +
                "        },\n" +
                "        \"VITC\": {\n" +
                "            \"label\": \"Vitamin C\",\n" +
                "            \"quantity\": 8.372,\n" +
                "            \"unit\": \"mg\"\n" +
                "        },\n" +
                "        \"THIA\": {\n" +
                "            \"label\": \"Thiamin (B1)\",\n" +
                "            \"quantity\": 0.030940000000000002,\n" +
                "            \"unit\": \"mg\"\n" +
                "        },\n" +
                "        \"RIBF\": {\n" +
                "            \"label\": \"Riboflavin (B2)\",\n" +
                "            \"quantity\": 0.04732,\n" +
                "            \"unit\": \"mg\"\n" +
                "        },\n" +
                "        \"NIA\": {\n" +
                "            \"label\": \"Niacin (B3)\",\n" +
                "            \"quantity\": 0.16562,\n" +
                "            \"unit\": \"mg\"\n" +
                "        },\n" +
                "        \"VITB6A\": {\n" +
                "            \"label\": \"Vitamin B6\",\n" +
                "            \"quantity\": 0.07462,\n" +
                "            \"unit\": \"mg\"\n" +
                "        },\n" +
                "        \"FOLDFE\": {\n" +
                "            \"label\": \"Folate equivalent (total)\",\n" +
                "            \"quantity\": 5.46,\n" +
                "            \"unit\": \"µg\"\n" +
                "        },\n" +
                "        \"FOLFD\": {\n" +
                "            \"label\": \"Folate (food)\",\n" +
                "            \"quantity\": 5.46,\n" +
                "            \"unit\": \"µg\"\n" +
                "        },\n" +
                "        \"FOLAC\": {\n" +
                "            \"label\": \"Folic acid\",\n" +
                "            \"quantity\": 0.0,\n" +
                "            \"unit\": \"µg\"\n" +
                "        },\n" +
                "        \"VITB12\": {\n" +
                "            \"label\": \"Vitamin B12\",\n" +
                "            \"quantity\": 0.0,\n" +
                "            \"unit\": \"µg\"\n" +
                "        },\n" +
                "        \"VITD\": {\n" +
                "            \"label\": \"Vitamin D\",\n" +
                "            \"quantity\": 0.0,\n" +
                "            \"unit\": \"µg\"\n" +
                "        },\n" +
                "        \"TOCPHA\": {\n" +
                "            \"label\": \"Vitamin E\",\n" +
                "            \"quantity\": 0.3276,\n" +
                "            \"unit\": \"mg\"\n" +
                "        },\n" +
                "        \"VITK1\": {\n" +
                "            \"label\": \"Vitamin K\",\n" +
                "            \"quantity\": 4.0040000000000004,\n" +
                "            \"unit\": \"µg\"\n" +
                "        },\n" +
                "        \"WATER\": {\n" +
                "            \"label\": \"Water\",\n" +
                "            \"quantity\": 155.7192,\n" +
                "            \"unit\": \"g\"\n" +
                "        }\n" +
                "    },\n" +
                "    \"totalDaily\": {\n" +
                "        \"ENERC_KCAL\": {\n" +
                "            \"label\": \"Energy\",\n" +
                "            \"quantity\": 4.732,\n" +
                "            \"unit\": \"%\"\n" +
                "        },\n" +
                "        \"FAT\": {\n" +
                "            \"label\": \"Fat\",\n" +
                "            \"quantity\": 0.47600000000000003,\n" +
                "            \"unit\": \"%\"\n" +
                "        },\n" +
                "        \"FASAT\": {\n" +
                "            \"label\": \"Saturated\",\n" +
                "            \"quantity\": 0.2548,\n" +
                "            \"unit\": \"%\"\n" +
                "        },\n" +
                "        \"CHOCDF\": {\n" +
                "            \"label\": \"Carbs\",\n" +
                "            \"quantity\": 8.378066666666669,\n" +
                "            \"unit\": \"%\"\n" +
                "        },\n" +
                "        \"FIBTG\": {\n" +
                "            \"label\": \"Fiber\",\n" +
                "            \"quantity\": 17.472,\n" +
                "            \"unit\": \"%\"\n" +
                "        },\n" +
                "        \"PROCNT\": {\n" +
                "            \"label\": \"Protein\",\n" +
                "            \"quantity\": 0.9464,\n" +
                "            \"unit\": \"%\"\n" +
                "        },\n" +
                "        \"CHOLE\": {\n" +
                "            \"label\": \"Cholesterol\",\n" +
                "            \"quantity\": 0.0,\n" +
                "            \"unit\": \"%\"\n" +
                "        },\n" +
                "        \"NA\": {\n" +
                "            \"label\": \"Sodium\",\n" +
                "            \"quantity\": 0.07583333333333334,\n" +
                "            \"unit\": \"%\"\n" +
                "        },\n" +
                "        \"CA\": {\n" +
                "            \"label\": \"Calcium\",\n" +
                "            \"quantity\": 1.092,\n" +
                "            \"unit\": \"%\"\n" +
                "        },\n" +
                "        \"MG\": {\n" +
                "            \"label\": \"Magnesium\",\n" +
                "            \"quantity\": 2.1666666666666665,\n" +
                "            \"unit\": \"%\"\n" +
                "        },\n" +
                "        \"K\": {\n" +
                "            \"label\": \"Potassium\",\n" +
                "            \"quantity\": 4.143404255319149,\n" +
                "            \"unit\": \"%\"\n" +
                "        },\n" +
                "        \"FE\": {\n" +
                "            \"label\": \"Iron\",\n" +
                "            \"quantity\": 1.2133333333333334,\n" +
                "            \"unit\": \"%\"\n" +
                "        },\n" +
                "        \"ZN\": {\n" +
                "            \"label\": \"Zinc\",\n" +
                "            \"quantity\": 0.6618181818181819,\n" +
                "            \"unit\": \"%\"\n" +
                "        },\n" +
                "        \"P\": {\n" +
                "            \"label\": \"Phosphorus\",\n" +
                "            \"quantity\": 2.86,\n" +
                "            \"unit\": \"%\"\n" +
                "        },\n" +
                "        \"VITA_RAE\": {\n" +
                "            \"label\": \"Vitamin A\",\n" +
                "            \"quantity\": 0.6066666666666667,\n" +
                "            \"unit\": \"%\"\n" +
                "        },\n" +
                "        \"VITC\": {\n" +
                "            \"label\": \"Vitamin C\",\n" +
                "            \"quantity\": 9.302222222222223,\n" +
                "            \"unit\": \"%\"\n" +
                "        },\n" +
                "        \"THIA\": {\n" +
                "            \"label\": \"Thiamin (B1)\",\n" +
                "            \"quantity\": 2.5783333333333336,\n" +
                "            \"unit\": \"%\"\n" +
                "        },\n" +
                "        \"RIBF\": {\n" +
                "            \"label\": \"Riboflavin (B2)\",\n" +
                "            \"quantity\": 3.64,\n" +
                "            \"unit\": \"%\"\n" +
                "        },\n" +
                "        \"NIA\": {\n" +
                "            \"label\": \"Niacin (B3)\",\n" +
                "            \"quantity\": 1.0351249999999999,\n" +
                "            \"unit\": \"%\"\n" +
                "        },\n" +
                "        \"VITB6A\": {\n" +
                "            \"label\": \"Vitamin B6\",\n" +
                "            \"quantity\": 5.74,\n" +
                "            \"unit\": \"%\"\n" +
                "        },\n" +
                "        \"FOLDFE\": {\n" +
                "            \"label\": \"Folate equivalent (total)\",\n" +
                "            \"quantity\": 1.365,\n" +
                "            \"unit\": \"%\"\n" +
                "        },\n" +
                "        \"VITB12\": {\n" +
                "            \"label\": \"Vitamin B12\",\n" +
                "            \"quantity\": 0.0,\n" +
                "            \"unit\": \"%\"\n" +
                "        },\n" +
                "        \"VITD\": {\n" +
                "            \"label\": \"Vitamin D\",\n" +
                "            \"quantity\": 0.0,\n" +
                "            \"unit\": \"%\"\n" +
                "        },\n" +
                "        \"TOCPHA\": {\n" +
                "            \"label\": \"Vitamin E\",\n" +
                "            \"quantity\": 2.1839999999999997,\n" +
                "            \"unit\": \"%\"\n" +
                "        },\n" +
                "        \"VITK1\": {\n" +
                "            \"label\": \"Vitamin K\",\n" +
                "            \"quantity\": 3.336666666666667,\n" +
                "            \"unit\": \"%\"\n" +
                "        }\n" +
                "    },\n" +
                "    \"ingredients\": [\n" +
                "        {\n" +
                "            \"parsed\": [\n" +
                "                {\n" +
                "                    \"quantity\": 1.0,\n" +
                "                    \"measure\": \"whole\",\n" +
                "                    \"food\": \"Apples, raw, with skin\",\n" +
                "                    \"foodId\": \"food_bnbh4ycaqj9as0a9z7h9xb2wmgat\",\n" +
                "                    \"weight\": 182.0,\n" +
                "                    \"retainedWeight\": 182.0,\n" +
                "                    \"measureURI\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                "                    \"status\": \"OK\"\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        NutrientWrapper nw = new NutrientWrapper();
        JSONUtil.jsonToNutrientWrapper(nw,str);

        assertEquals("http://www.edamam.com/ontologies/edamam.owl#3b66ba29-954d-42b0-ba85-0ee170150a8e",nw.getUri());
        assertNull(nw.getYield());
        assertEquals(94, nw.getCalories(), 0.0);
        assertNull(nw.getGlycemicIndex());
        assertEquals(182.0, nw.getTotalWeight(), 0.0);
        assertEquals(0,nw.getDietLabels().size());
        assertEquals(28,nw.getHealthLabels().size());
        assertEquals(1,nw.getCautions().size());
        assertEquals("SULFITES",nw.getCautions().get(0));
        assertEquals(2,nw.getTotalNutrients().size());
        assertEquals("Energy",nw.getTotalNutrients().get(0).getLabel());
        assertEquals(94.64,nw.getTotalNutrients().get(0).getQuantity(),0.0);
        assertEquals(2,nw.getTotalDaily().size());
        assertEquals("Apples, raw, with skin",nw.getFood());
        assertNotNull(nw.getIngredient());
    }

    @Test
    public void getEmailValueTest(){
        NutrientWrapper test=new NutrientWrapper();
        test.setFood("food");
        test.setUri("uri.com");
        test.setCalories((double)100);
        test.setGlycemicIndex((double)5);
        test.getDietLabels().add("dietLabel1");
        test.getHealthLabels().add("healthLabel1");
        test.getHealthLabels().add("healthLabel2");
        Nutrient n =new Nutrient();
        n.setName("nutrient1");
        n.setLabel("nutrientLabel");
        n.setUnit("unit1");
        n.setQuantity(2.0);
        test.getTotalNutrients().add(n);
        test.getTotalDaily().add(n);
        Ingredient i = new Ingredient();
        i.setQuantity((double)1);
        i.setMeasureURI("fakeuri");
        i.setFoodId("foodid");
        test.setIngredient(i);

        assertNotNull(JSONUtil.getEmailValue(test));
    }

    @Test
    public void getEmailJSONTest(){
        NutrientWrapper test=new NutrientWrapper();
        test.setFood("food");
        test.setUri("uri.com");
        test.setCalories((double)100);
        test.setGlycemicIndex((double)5);
        test.getDietLabels().add("dietLabel1");
        test.getHealthLabels().add("healthLabel1");
        test.getHealthLabels().add("healthLabel2");
        Nutrient n =new Nutrient();
        n.setName("nutrient1");
        n.setLabel("nutrientLabel");
        n.setUnit("unit1");
        n.setQuantity(2.0);
        test.getTotalNutrients().add(n);
        test.getTotalDaily().add(n);
        Ingredient i = new Ingredient();
        i.setQuantity((double)1);
        i.setMeasureURI("fakeuri");
        i.setFoodId("foodid");
        test.setIngredient(i);
        JSONObject email = JSONUtil.getEmailJSON(test);
        assertNotNull(email);
    }

    @Test
    public void getSpecialEmailTest(){
        CacheUtil.setMaxCalorie(90);
        NutrientWrapper test=new NutrientWrapper();
        test.setFood("food");
        test.setUri("uri.com");
        test.setCalories((double)100);
        test.setGlycemicIndex((double)5);
        test.getDietLabels().add("dietLabel1");
        test.getHealthLabels().add("healthLabel1");
        test.getHealthLabels().add("healthLabel2");
        Nutrient n =new Nutrient();
        n.setName("nutrient1");
        n.setLabel("nutrientLabel");
        n.setUnit("unit1");
        n.setQuantity(2.0);
        test.getTotalNutrients().add(n);
        test.getTotalDaily().add(n);
        Ingredient i = new Ingredient();
        i.setQuantity((double)1);
        i.setMeasureURI("fakeuri");
        i.setFoodId("foodid");
        test.setIngredient(i);
        JSONObject email = JSONUtil.getEmailJSON(test);
        assertTrue(email.toJSONString().contains("*"));
        int count=0;
        String tmp = email.toJSONString();
        while (tmp.contains("*")){
            tmp=tmp.substring(tmp.indexOf("*")+1);
            count++;
        }
        assertEquals(2,count);

    }

    @After
    public void clean(){
        CacheUtil.setMaxCalorie(null);
    }


}