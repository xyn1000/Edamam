package exam.service.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import exam.Constants;
import exam.entity.HintsWrapper;
import exam.entity.NutrientWrapper;
import exam.service.EmailService;
import exam.service.FoodService;
import exam.util.JSONUtil;

import java.io.IOException;

public class DummyServiceImpl implements EmailService, FoodService {
    @Override
    public boolean emailRequest(String token, JSONObject obj) {
        String rs = obj.toJSONString();
        System.out.println("An email has been sent to "+ Constants.receiverEmail);
        System.out.println(rs);
        return true;
    }

    @Override
    public HintsWrapper search(String ingr, String appId, String appKey) throws IOException {
        if (ingr.equals("apple")){
            String str = "{\n" +
                    "    \"text\": \"apple\",\n" +
                    "    \"parsed\": [\n" +
                    "        {\n" +
                    "            \"food\": {\n" +
                    "                \"foodId\": \"food_a1gb9ubb72c7snbuxr3weagwv0dd\",\n" +
                    "                \"label\": \"Apple\",\n" +
                    "                \"nutrients\": {\n" +
                    "                    \"ENERC_KCAL\": 52.0,\n" +
                    "                    \"PROCNT\": 0.26,\n" +
                    "                    \"FAT\": 0.17,\n" +
                    "                    \"CHOCDF\": 13.81,\n" +
                    "                    \"FIBTG\": 2.4\n" +
                    "                },\n" +
                    "                \"category\": \"Generic foods\",\n" +
                    "                \"categoryLabel\": \"food\",\n" +
                    "                \"image\": \"https://www.edamam.com/food-img/42c/42c006401027d35add93113548eeaae6.jpg\"\n" +
                    "            }\n" +
                    "        }\n" +
                    "    ],\n" +
                    "    \"hints\": [\n" +
                    "        {\n" +
                    "            \"food\": {\n" +
                    "                \"foodId\": \"food_a1gb9ubb72c7snbuxr3weagwv0dd\",\n" +
                    "                \"label\": \"Apple\",\n" +
                    "                \"nutrients\": {\n" +
                    "                    \"ENERC_KCAL\": 52.0,\n" +
                    "                    \"PROCNT\": 0.26,\n" +
                    "                    \"FAT\": 0.17,\n" +
                    "                    \"CHOCDF\": 13.81,\n" +
                    "                    \"FIBTG\": 2.4\n" +
                    "                },\n" +
                    "                \"category\": \"Generic foods\",\n" +
                    "                \"categoryLabel\": \"food\",\n" +
                    "                \"image\": \"https://www.edamam.com/food-img/42c/42c006401027d35add93113548eeaae6.jpg\"\n" +
                    "            },\n" +
                    "            \"measures\": [\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                    "                    \"label\": \"Whole\",\n" +
                    "                    \"weight\": 182.0,\n" +
                    "                    \"qualified\": [\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_large\",\n" +
                    "                                    \"label\": \"large\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 223.0\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_small\",\n" +
                    "                                    \"label\": \"small\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 149.0\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_medium\",\n" +
                    "                                    \"label\": \"medium\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 182.0\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                    "                    \"label\": \"Serving\",\n" +
                    "                    \"weight\": 242.0\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_apple\",\n" +
                    "                    \"label\": \"Apple\",\n" +
                    "                    \"weight\": 182.0\n" +
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
                    "                    \"weight\": 109.0,\n" +
                    "                    \"qualified\": [\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_quartered\",\n" +
                    "                                    \"label\": \"quartered\"\n" +
                    "                                },\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_chopped\",\n" +
                    "                                    \"label\": \"chopped\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 125.0\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            ]\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"food\": {\n" +
                    "                \"foodId\": \"food_a1gb9ubb72c7snbuxr3weagwv0dd\",\n" +
                    "                \"label\": \"Empire Apple\",\n" +
                    "                \"nutrients\": {\n" +
                    "                    \"ENERC_KCAL\": 52.0,\n" +
                    "                    \"PROCNT\": 0.26,\n" +
                    "                    \"FAT\": 0.17,\n" +
                    "                    \"CHOCDF\": 13.81,\n" +
                    "                    \"FIBTG\": 2.4\n" +
                    "                },\n" +
                    "                \"category\": \"Generic foods\",\n" +
                    "                \"categoryLabel\": \"food\",\n" +
                    "                \"image\": \"https://www.edamam.com/food-img/42c/42c006401027d35add93113548eeaae6.jpg\"\n" +
                    "            },\n" +
                    "            \"measures\": [\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                    "                    \"label\": \"Whole\",\n" +
                    "                    \"weight\": 182.0,\n" +
                    "                    \"qualified\": [\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_large\",\n" +
                    "                                    \"label\": \"large\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 223.0\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_small\",\n" +
                    "                                    \"label\": \"small\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 149.0\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_medium\",\n" +
                    "                                    \"label\": \"medium\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 182.0\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                    "                    \"label\": \"Serving\",\n" +
                    "                    \"weight\": 242.0\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_apple\",\n" +
                    "                    \"label\": \"Apple\",\n" +
                    "                    \"weight\": 182.0\n" +
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
                    "                    \"weight\": 109.0,\n" +
                    "                    \"qualified\": [\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_quartered\",\n" +
                    "                                    \"label\": \"quartered\"\n" +
                    "                                },\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_chopped\",\n" +
                    "                                    \"label\": \"chopped\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 125.0\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            ]\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"food\": {\n" +
                    "                \"foodId\": \"food_a1gb9ubb72c7snbuxr3weagwv0dd\",\n" +
                    "                \"label\": \"Sorb Apple\",\n" +
                    "                \"nutrients\": {\n" +
                    "                    \"ENERC_KCAL\": 52.0,\n" +
                    "                    \"PROCNT\": 0.26,\n" +
                    "                    \"FAT\": 0.17,\n" +
                    "                    \"CHOCDF\": 13.81,\n" +
                    "                    \"FIBTG\": 2.4\n" +
                    "                },\n" +
                    "                \"category\": \"Generic foods\",\n" +
                    "                \"categoryLabel\": \"food\",\n" +
                    "                \"image\": \"https://www.edamam.com/food-img/42c/42c006401027d35add93113548eeaae6.jpg\"\n" +
                    "            },\n" +
                    "            \"measures\": [\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                    "                    \"label\": \"Whole\",\n" +
                    "                    \"weight\": 182.0,\n" +
                    "                    \"qualified\": [\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_large\",\n" +
                    "                                    \"label\": \"large\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 223.0\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_small\",\n" +
                    "                                    \"label\": \"small\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 149.0\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_medium\",\n" +
                    "                                    \"label\": \"medium\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 182.0\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                    "                    \"label\": \"Serving\",\n" +
                    "                    \"weight\": 242.0\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_apple\",\n" +
                    "                    \"label\": \"Apple\",\n" +
                    "                    \"weight\": 182.0\n" +
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
                    "                    \"weight\": 109.0,\n" +
                    "                    \"qualified\": [\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_quartered\",\n" +
                    "                                    \"label\": \"quartered\"\n" +
                    "                                },\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_chopped\",\n" +
                    "                                    \"label\": \"chopped\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 125.0\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            ]\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"food\": {\n" +
                    "                \"foodId\": \"food_amhlqj0by3ozesbg96kkhar1atxt\",\n" +
                    "                \"label\": \"Fuji Apple\",\n" +
                    "                \"nutrients\": {\n" +
                    "                    \"ENERC_KCAL\": 63.0,\n" +
                    "                    \"PROCNT\": 0.2,\n" +
                    "                    \"FAT\": 0.18,\n" +
                    "                    \"CHOCDF\": 15.22,\n" +
                    "                    \"FIBTG\": 2.1\n" +
                    "                },\n" +
                    "                \"category\": \"Generic foods\",\n" +
                    "                \"categoryLabel\": \"food\",\n" +
                    "                \"image\": \"https://www.edamam.com/food-img/327/327e8b398000b83e4764ca0bab240f14.jpg\"\n" +
                    "            },\n" +
                    "            \"measures\": [\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                    "                    \"label\": \"Whole\",\n" +
                    "                    \"weight\": 197.15555555555557,\n" +
                    "                    \"qualified\": [\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_medium\",\n" +
                    "                                    \"label\": \"medium\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 192.0\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_large\",\n" +
                    "                                    \"label\": \"large\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 236.0\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_small\",\n" +
                    "                                    \"label\": \"small\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 158.0\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                    "                    \"label\": \"Serving\",\n" +
                    "                    \"weight\": 55.0\n" +
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
                    "                    \"weight\": 109.0,\n" +
                    "                    \"qualified\": [\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_sliced\",\n" +
                    "                                    \"label\": \"sliced\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 109.0\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            ]\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"food\": {\n" +
                    "                \"foodId\": \"food_bfh0qoxboaspbtbj3gqnkafdf2r9\",\n" +
                    "                \"label\": \"Gala Apple\",\n" +
                    "                \"nutrients\": {\n" +
                    "                    \"ENERC_KCAL\": 57.0,\n" +
                    "                    \"PROCNT\": 0.25,\n" +
                    "                    \"FAT\": 0.12,\n" +
                    "                    \"CHOCDF\": 13.68,\n" +
                    "                    \"FIBTG\": 2.3\n" +
                    "                },\n" +
                    "                \"category\": \"Generic foods\",\n" +
                    "                \"categoryLabel\": \"food\",\n" +
                    "                \"image\": \"https://www.edamam.com/food-img/256/2568844fd3c89a9fa6ef0a07757ed572.jpg\"\n" +
                    "            },\n" +
                    "            \"measures\": [\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                    "                    \"label\": \"Whole\",\n" +
                    "                    \"weight\": 180.44444444444446,\n" +
                    "                    \"qualified\": [\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_medium\",\n" +
                    "                                    \"label\": \"medium\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 172.0\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_large\",\n" +
                    "                                    \"label\": \"large\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 200.0\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_small\",\n" +
                    "                                    \"label\": \"small\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 157.0\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                    "                    \"label\": \"Serving\",\n" +
                    "                    \"weight\": 55.0\n" +
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
                    "                    \"weight\": 109.0,\n" +
                    "                    \"qualified\": [\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_sliced\",\n" +
                    "                                    \"label\": \"sliced\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 109.0\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            ]\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"food\": {\n" +
                    "                \"foodId\": \"food_bxlgb9vbmjhys5bt5sopab22g4ld\",\n" +
                    "                \"label\": \"Peeled Apple\",\n" +
                    "                \"nutrients\": {\n" +
                    "                    \"ENERC_KCAL\": 48.0,\n" +
                    "                    \"PROCNT\": 0.27,\n" +
                    "                    \"FAT\": 0.13,\n" +
                    "                    \"CHOCDF\": 12.76,\n" +
                    "                    \"FIBTG\": 1.3\n" +
                    "                },\n" +
                    "                \"category\": \"Generic foods\",\n" +
                    "                \"categoryLabel\": \"food\",\n" +
                    "                \"image\": \"https://www.edamam.com/food-img/5aa/5aac39c4acdc63e48312cea5c28329f4.jpg\"\n" +
                    "            },\n" +
                    "            \"measures\": [\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                    "                    \"label\": \"Whole\",\n" +
                    "                    \"weight\": 169.93333333333334,\n" +
                    "                    \"qualified\": [\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_large\",\n" +
                    "                                    \"label\": \"large\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 216.0\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_small\",\n" +
                    "                                    \"label\": \"small\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 132.0\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_medium\",\n" +
                    "                                    \"label\": \"medium\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 161.0\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                    "                    \"label\": \"Serving\",\n" +
                    "                    \"weight\": 110.0\n" +
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
                    "                    \"weight\": 110.0\n" +
                    "                }\n" +
                    "            ]\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"food\": {\n" +
                    "                \"foodId\": \"food_b4m99bgatuhmfybeq0d7xa9uvr1b\",\n" +
                    "                \"label\": \"Green Apple\",\n" +
                    "                \"nutrients\": {\n" +
                    "                    \"ENERC_KCAL\": 58.0,\n" +
                    "                    \"PROCNT\": 0.44,\n" +
                    "                    \"FAT\": 0.19,\n" +
                    "                    \"CHOCDF\": 13.61,\n" +
                    "                    \"FIBTG\": 2.8\n" +
                    "                },\n" +
                    "                \"category\": \"Generic foods\",\n" +
                    "                \"categoryLabel\": \"food\",\n" +
                    "                \"image\": \"https://www.edamam.com/food-img/288/288a6646dd6bb05a482f4405bf6e2861.jpg\"\n" +
                    "            },\n" +
                    "            \"measures\": [\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                    "                    \"label\": \"Whole\",\n" +
                    "                    \"weight\": 174.6,\n" +
                    "                    \"qualified\": [\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_large\",\n" +
                    "                                    \"label\": \"large\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 206.0\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_medium\",\n" +
                    "                                    \"label\": \"medium\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 167.0\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_small\",\n" +
                    "                                    \"label\": \"small\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 144.0\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                    "                    \"label\": \"Serving\",\n" +
                    "                    \"weight\": 55.0\n" +
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
                    "                    \"weight\": 109.0,\n" +
                    "                    \"qualified\": [\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_sliced\",\n" +
                    "                                    \"label\": \"sliced\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 109.0\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            ]\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"food\": {\n" +
                    "                \"foodId\": \"food_bacmbq9afv8uq3bm26em4anhw12o\",\n" +
                    "                \"label\": \"Golden Delicious Apple\",\n" +
                    "                \"nutrients\": {\n" +
                    "                    \"ENERC_KCAL\": 57.0,\n" +
                    "                    \"PROCNT\": 0.28,\n" +
                    "                    \"FAT\": 0.15,\n" +
                    "                    \"CHOCDF\": 13.6,\n" +
                    "                    \"FIBTG\": 2.4\n" +
                    "                },\n" +
                    "                \"category\": \"Generic foods\",\n" +
                    "                \"categoryLabel\": \"food\",\n" +
                    "                \"image\": \"https://www.edamam.com/food-img/683/6838f8020957c737b95ad3236ba710a3.jpg\"\n" +
                    "            },\n" +
                    "            \"measures\": [\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                    "                    \"label\": \"Whole\",\n" +
                    "                    \"weight\": 171.0,\n" +
                    "                    \"qualified\": [\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_medium\",\n" +
                    "                                    \"label\": \"medium\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 169.0\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_large\",\n" +
                    "                                    \"label\": \"large\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 215.0\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_small\",\n" +
                    "                                    \"label\": \"small\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 129.0\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                    "                    \"label\": \"Serving\",\n" +
                    "                    \"weight\": 200.0\n" +
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
                    "                    \"weight\": 109.0,\n" +
                    "                    \"qualified\": [\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_sliced\",\n" +
                    "                                    \"label\": \"sliced\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 109.0\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            ]\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"food\": {\n" +
                    "                \"foodId\": \"food_a6ew6eha0m4nx4blvb73tbhfjcw6\",\n" +
                    "                \"label\": \"Red Delicious Apple\",\n" +
                    "                \"nutrients\": {\n" +
                    "                    \"ENERC_KCAL\": 59.0,\n" +
                    "                    \"PROCNT\": 0.27,\n" +
                    "                    \"FAT\": 0.2,\n" +
                    "                    \"CHOCDF\": 14.06,\n" +
                    "                    \"FIBTG\": 2.3\n" +
                    "                },\n" +
                    "                \"category\": \"Generic foods\",\n" +
                    "                \"categoryLabel\": \"food\",\n" +
                    "                \"image\": \"https://www.edamam.com/food-img/e9a/e9a0cedf31414f009fba31eab13e552b.jpg\"\n" +
                    "            },\n" +
                    "            \"measures\": [\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                    "                    \"label\": \"Whole\",\n" +
                    "                    \"weight\": 210.2222222222222,\n" +
                    "                    \"qualified\": [\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_small\",\n" +
                    "                                    \"label\": \"small\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 158.0\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_medium\",\n" +
                    "                                    \"label\": \"medium\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 212.0\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_large\",\n" +
                    "                                    \"label\": \"large\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 260.0\n" +
                    "                        }\n" +
                    "                    ]\n" +
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
                    "                    \"weight\": 109.0,\n" +
                    "                    \"qualified\": [\n" +
                    "                        {\n" +
                    "                            \"qualifiers\": [\n" +
                    "                                {\n" +
                    "                                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Qualifier_sliced\",\n" +
                    "                                    \"label\": \"sliced\"\n" +
                    "                                }\n" +
                    "                            ],\n" +
                    "                            \"weight\": 109.0\n" +
                    "                        }\n" +
                    "                    ]\n" +
                    "                }\n" +
                    "            ]\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"food\": {\n" +
                    "                \"foodId\": \"food_b61a32bboh5z1naughqq3bk507cj\",\n" +
                    "                \"label\": \"Apple Jelly, Apple\",\n" +
                    "                \"nutrients\": {\n" +
                    "                    \"ENERC_KCAL\": 250.0,\n" +
                    "                    \"PROCNT\": 0.0,\n" +
                    "                    \"FAT\": 0.0,\n" +
                    "                    \"CHOCDF\": 65.0\n" +
                    "                },\n" +
                    "                \"brand\": \"Hy-Vee\",\n" +
                    "                \"category\": \"Packaged foods\",\n" +
                    "                \"categoryLabel\": \"food\",\n" +
                    "                \"foodContentsLabel\": \"APPLE JUICE (WATER; APPLE JUICE CONCENTRATE); HIGH FRUCTOSE CORN SYRUP; CORN SYRUP; CONTAINS LESS THAN 2% OF: FRUIT PECTIN; CITRIC ACID.\",\n" +
                    "                \"image\": \"https://www.edamam.com/food-img/5f7/5f77579127213b1e255087f07fb32899.jpg\",\n" +
                    "                \"servingSizes\": [\n" +
                    "                    {\n" +
                    "                        \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                    "                        \"label\": \"Gram\",\n" +
                    "                        \"quantity\": 20.0\n" +
                    "                    },\n" +
                    "                    {\n" +
                    "                        \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_tablespoon\",\n" +
                    "                        \"label\": \"Tablespoon\",\n" +
                    "                        \"quantity\": 1.0\n" +
                    "                    }\n" +
                    "                ],\n" +
                    "                \"servingsPerContainer\": 1.0005714044117646\n" +
                    "            },\n" +
                    "            \"measures\": [\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                    "                    \"label\": \"Serving\",\n" +
                    "                    \"weight\": 20.0\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_package\",\n" +
                    "                    \"label\": \"Package\",\n" +
                    "                    \"weight\": 340.19427749999994\n" +
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
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_tablespoon\",\n" +
                    "                    \"label\": \"Tablespoon\",\n" +
                    "                    \"weight\": 20.0\n" +
                    "                }\n" +
                    "            ]\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"food\": {\n" +
                    "                \"foodId\": \"food_aqgwowob88ca3wbc8oxd6aol3rfk\",\n" +
                    "                \"label\": \"Apple Country, Apples\",\n" +
                    "                \"nutrients\": {\n" +
                    "                    \"ENERC_KCAL\": 51.94805194805195,\n" +
                    "                    \"PROCNT\": 0.0,\n" +
                    "                    \"FAT\": 0.0,\n" +
                    "                    \"CHOCDF\": 14.29220794083236,\n" +
                    "                    \"FIBTG\": 3.1818182437450853\n" +
                    "                },\n" +
                    "                \"brand\": \"Apple Country\",\n" +
                    "                \"category\": \"Packaged foods\",\n" +
                    "                \"categoryLabel\": \"food\",\n" +
                    "                \"foodContentsLabel\": \"Apple\",\n" +
                    "                \"servingSizes\": [\n" +
                    "                    {\n" +
                    "                        \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                    "                        \"label\": \"Gram\",\n" +
                    "                        \"quantity\": 154.0\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            },\n" +
                    "            \"measures\": [\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                    "                    \"label\": \"Serving\",\n" +
                    "                    \"weight\": 154.0\n" +
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
                    "                \"foodId\": \"food_be9kxv3bo7sobaakr2rceautpjp2\",\n" +
                    "                \"label\": \"Apple Country  Apples\",\n" +
                    "                \"nutrients\": {\n" +
                    "                    \"ENERC_KCAL\": 7.7,\n" +
                    "                    \"PROCNT\": 0.03899999856948853,\n" +
                    "                    \"FAT\": 0.025,\n" +
                    "                    \"CHOCDF\": 2.0579999923706054,\n" +
                    "                    \"FIBTG\": 0.35999999046325687\n" +
                    "                },\n" +
                    "                \"brand\": \"Apple Country\",\n" +
                    "                \"category\": \"Packaged foods\",\n" +
                    "                \"categoryLabel\": \"food\",\n" +
                    "                \"foodContentsLabel\": \"Apple\",\n" +
                    "                \"image\": \"https://www.edamam.com/food-img/9f5/9f54a8bbadc9febf4d71bc96698ab803.jpg\",\n" +
                    "                \"servingSizes\": [\n" +
                    "                    {\n" +
                    "                        \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_kilogram\",\n" +
                    "                        \"label\": \"Kilogram\",\n" +
                    "                        \"quantity\": 1.0\n" +
                    "                    },\n" +
                    "                    {\n" +
                    "                        \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                    "                        \"label\": \"Gram\",\n" +
                    "                        \"quantity\": 1.0\n" +
                    "                    }\n" +
                    "                ],\n" +
                    "                \"servingsPerContainer\": 1.0\n" +
                    "            },\n" +
                    "            \"measures\": [\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                    "                    \"label\": \"Serving\",\n" +
                    "                    \"weight\": 1000.0\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_package\",\n" +
                    "                    \"label\": \"Package\",\n" +
                    "                    \"weight\": 48000.0\n" +
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
                    "                \"foodId\": \"food_b8rrwcpbvba3asaru2mdsbagsbs2\",\n" +
                    "                \"label\": \"Apple-Crisp Baked Apples\",\n" +
                    "                \"nutrients\": {\n" +
                    "                    \"ENERC_KCAL\": 106.03956616796349,\n" +
                    "                    \"PROCNT\": 0.9362503447706831,\n" +
                    "                    \"FAT\": 6.077002847401216,\n" +
                    "                    \"CHOCDF\": 13.683948357131875,\n" +
                    "                    \"FIBTG\": 2.1664565256307085\n" +
                    "                },\n" +
                    "                \"category\": \"Generic meals\",\n" +
                    "                \"categoryLabel\": \"meal\",\n" +
                    "                \"foodContentsLabel\": \"walnuts; pecans; brown sugar; kosher salt; ground cinnamon; cardamom; rolled oats; butter; apples; apple cider; vanilla ice cream\"\n" +
                    "            },\n" +
                    "            \"measures\": [\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                    "                    \"label\": \"Whole\",\n" +
                    "                    \"weight\": 269.9751485243261\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                    "                    \"label\": \"Serving\",\n" +
                    "                    \"weight\": 269.9751485243261\n" +
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
                    "                \"foodId\": \"food_bcruvycav1jponay8eu0oa5fkbhx\",\n" +
                    "                \"label\": \"Apple Pie Baked Apples\",\n" +
                    "                \"nutrients\": {\n" +
                    "                    \"ENERC_KCAL\": 134.5233856921379,\n" +
                    "                    \"PROCNT\": 1.1491020469471132,\n" +
                    "                    \"FAT\": 3.202887624039124,\n" +
                    "                    \"CHOCDF\": 27.022139090138158,\n" +
                    "                    \"FIBTG\": 2.160775443025757\n" +
                    "                },\n" +
                    "                \"category\": \"Generic meals\",\n" +
                    "                \"categoryLabel\": \"meal\",\n" +
                    "                \"foodContentsLabel\": \"Apples; Dark Brown Sugar; ground cinnamon; oats; all purpose flour; unsalted butter; kosher salt; orange; orange juice; honey\"\n" +
                    "            },\n" +
                    "            \"measures\": [\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                    "                    \"label\": \"Whole\",\n" +
                    "                    \"weight\": 271.6189236111214\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                    "                    \"label\": \"Serving\",\n" +
                    "                    \"weight\": 271.6189236111214\n" +
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
                    "                \"foodId\": \"food_alf4rnzbbw62pla3tdbosau0jh5s\",\n" +
                    "                \"label\": \"Apple\",\n" +
                    "                \"nutrients\": {\n" +
                    "                    \"ENERC_KCAL\": 51.94805194805195,\n" +
                    "                    \"PROCNT\": 0.0,\n" +
                    "                    \"FAT\": 0.0,\n" +
                    "                    \"CHOCDF\": 14.29220794083236,\n" +
                    "                    \"FIBTG\": 3.1818182437450853\n" +
                    "                },\n" +
                    "                \"brand\": \"Honeybear Brands\",\n" +
                    "                \"category\": \"Packaged foods\",\n" +
                    "                \"categoryLabel\": \"food\",\n" +
                    "                \"foodContentsLabel\": \"Apples\",\n" +
                    "                \"servingSizes\": [\n" +
                    "                    {\n" +
                    "                        \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                    "                        \"label\": \"Gram\",\n" +
                    "                        \"quantity\": 154.0\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            },\n" +
                    "            \"measures\": [\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                    "                    \"label\": \"Serving\",\n" +
                    "                    \"weight\": 154.0\n" +
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
                    "                \"foodId\": \"food_bjgna80bjia37ravs39oratd4t4z\",\n" +
                    "                \"label\": \"Apples\",\n" +
                    "                \"nutrients\": {\n" +
                    "                    \"ENERC_KCAL\": 51.94805194805195,\n" +
                    "                    \"PROCNT\": 0.0,\n" +
                    "                    \"FAT\": 0.0,\n" +
                    "                    \"CHOCDF\": 14.29220794083236,\n" +
                    "                    \"FIBTG\": 3.1818182437450853\n" +
                    "                },\n" +
                    "                \"brand\": \"Pinkids\",\n" +
                    "                \"category\": \"Packaged foods\",\n" +
                    "                \"categoryLabel\": \"food\",\n" +
                    "                \"foodContentsLabel\": \"Apples\",\n" +
                    "                \"servingSizes\": [\n" +
                    "                    {\n" +
                    "                        \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                    "                        \"label\": \"Gram\",\n" +
                    "                        \"quantity\": 154.0\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            },\n" +
                    "            \"measures\": [\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                    "                    \"label\": \"Serving\",\n" +
                    "                    \"weight\": 154.0\n" +
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
                    "                \"foodId\": \"food_ac5wwmobhru47ra2zum6la1zdnln\",\n" +
                    "                \"label\": \"Apples\",\n" +
                    "                \"nutrients\": {\n" +
                    "                    \"ENERC_KCAL\": 54.13223140495868,\n" +
                    "                    \"PROCNT\": 0.4090909130317121,\n" +
                    "                    \"FAT\": 0.4090909130317121,\n" +
                    "                    \"CHOCDF\": 14.049586776859504,\n" +
                    "                    \"FIBTG\": 2.107437977120896\n" +
                    "                },\n" +
                    "                \"brand\": \"Apple Wedge\",\n" +
                    "                \"category\": \"Packaged foods\",\n" +
                    "                \"categoryLabel\": \"food\",\n" +
                    "                \"foodContentsLabel\": \"Apples\",\n" +
                    "                \"servingSizes\": [\n" +
                    "                    {\n" +
                    "                        \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                    "                        \"label\": \"Gram\",\n" +
                    "                        \"quantity\": 242.0\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            },\n" +
                    "            \"measures\": [\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                    "                    \"label\": \"Serving\",\n" +
                    "                    \"weight\": 242.0\n" +
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
                    "                \"foodId\": \"food_acsiefta0dtto6a7srju9axnqgmh\",\n" +
                    "                \"label\": \"Apples\",\n" +
                    "                \"nutrients\": {\n" +
                    "                    \"ENERC_KCAL\": 51.94805194805195,\n" +
                    "                    \"PROCNT\": 0.0,\n" +
                    "                    \"FAT\": 0.0,\n" +
                    "                    \"CHOCDF\": 14.29220794083236,\n" +
                    "                    \"FIBTG\": 3.1818182437450853\n" +
                    "                },\n" +
                    "                \"brand\": \"Produce Marketing Association\",\n" +
                    "                \"category\": \"Packaged foods\",\n" +
                    "                \"categoryLabel\": \"food\",\n" +
                    "                \"foodContentsLabel\": \"Apples\",\n" +
                    "                \"servingSizes\": [\n" +
                    "                    {\n" +
                    "                        \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                    "                        \"label\": \"Gram\",\n" +
                    "                        \"quantity\": 154.0\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            },\n" +
                    "            \"measures\": [\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                    "                    \"label\": \"Serving\",\n" +
                    "                    \"weight\": 154.0\n" +
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
                    "                \"foodId\": \"food_awtilwybcoi3khbmhj5zja17u6x5\",\n" +
                    "                \"label\": \"Apple\",\n" +
                    "                \"nutrients\": {\n" +
                    "                    \"ENERC_KCAL\": 53.33333333333333,\n" +
                    "                    \"PROCNT\": 0.0,\n" +
                    "                    \"FAT\": 0.0,\n" +
                    "                    \"CHOCDF\": 14.666666666666666,\n" +
                    "                    \"FIBTG\": 3.333333333333333\n" +
                    "                },\n" +
                    "                \"brand\": \"Apples\",\n" +
                    "                \"category\": \"Packaged foods\",\n" +
                    "                \"categoryLabel\": \"food\",\n" +
                    "                \"foodContentsLabel\": \"Apple\",\n" +
                    "                \"image\": \"https://www.edamam.com/food-img/952/95283d2e88ddde6da732380d846e33c7.jpg\",\n" +
                    "                \"servingSizes\": [\n" +
                    "                    {\n" +
                    "                        \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                    "                        \"label\": \"Gram\",\n" +
                    "                        \"quantity\": 150.0\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            },\n" +
                    "            \"measures\": [\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                    "                    \"label\": \"Serving\",\n" +
                    "                    \"weight\": 150.0\n" +
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
                    "                \"foodId\": \"food_azhmnz7b7ufaedbbzbli1a1nquzu\",\n" +
                    "                \"label\": \"Apple\",\n" +
                    "                \"nutrients\": {\n" +
                    "                    \"ENERC_KCAL\": 53.719008264462815,\n" +
                    "                    \"PROCNT\": 0.4132231404958678,\n" +
                    "                    \"FAT\": 0.0,\n" +
                    "                    \"CHOCDF\": 14.049586776859504,\n" +
                    "                    \"FIBTG\": 2.066115702479339\n" +
                    "                },\n" +
                    "                \"brand\": \"Produce Marketers Association\",\n" +
                    "                \"category\": \"Packaged foods\",\n" +
                    "                \"categoryLabel\": \"food\",\n" +
                    "                \"foodContentsLabel\": \"Organic Apples.\",\n" +
                    "                \"image\": \"https://www.edamam.com/food-img/2ca/2ca1e30949d2e5a2fb01e92d6f69db82.jpg\",\n" +
                    "                \"servingSizes\": [\n" +
                    "                    {\n" +
                    "                        \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                    "                        \"label\": \"Gram\",\n" +
                    "                        \"quantity\": 242.0\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            },\n" +
                    "            \"measures\": [\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                    "                    \"label\": \"Serving\",\n" +
                    "                    \"weight\": 242.0\n" +
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
                    "                \"foodId\": \"food_bj030ujaizsbxcbik17jzblz8gmz\",\n" +
                    "                \"label\": \"Apples\",\n" +
                    "                \"nutrients\": {\n" +
                    "                    \"ENERC_KCAL\": 51.94805194805195,\n" +
                    "                    \"PROCNT\": 0.0,\n" +
                    "                    \"FAT\": 0.0,\n" +
                    "                    \"CHOCDF\": 14.29220794083236,\n" +
                    "                    \"FIBTG\": 3.1818182437450853\n" +
                    "                },\n" +
                    "                \"brand\": \"Apple Country\",\n" +
                    "                \"category\": \"Packaged foods\",\n" +
                    "                \"categoryLabel\": \"food\",\n" +
                    "                \"foodContentsLabel\": \"Apples\",\n" +
                    "                \"servingSizes\": [\n" +
                    "                    {\n" +
                    "                        \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                    "                        \"label\": \"Gram\",\n" +
                    "                        \"quantity\": 154.0\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            },\n" +
                    "            \"measures\": [\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                    "                    \"label\": \"Serving\",\n" +
                    "                    \"weight\": 154.0\n" +
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
                    "                \"foodId\": \"food_b52qyvfazt0m3abdstnp4a3dkvtl\",\n" +
                    "                \"label\": \"Apples\",\n" +
                    "                \"nutrients\": {\n" +
                    "                    \"ENERC_KCAL\": 51.94805194805195,\n" +
                    "                    \"PROCNT\": 0.0,\n" +
                    "                    \"FAT\": 0.0,\n" +
                    "                    \"CHOCDF\": 14.29220794083236,\n" +
                    "                    \"FIBTG\": 3.1818182437450853\n" +
                    "                },\n" +
                    "                \"brand\": \"Mountaineer\",\n" +
                    "                \"category\": \"Packaged foods\",\n" +
                    "                \"categoryLabel\": \"food\",\n" +
                    "                \"foodContentsLabel\": \"Apples\",\n" +
                    "                \"servingSizes\": [\n" +
                    "                    {\n" +
                    "                        \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_gram\",\n" +
                    "                        \"label\": \"Gram\",\n" +
                    "                        \"quantity\": 154.0\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            },\n" +
                    "            \"measures\": [\n" +
                    "                {\n" +
                    "                    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_serving\",\n" +
                    "                    \"label\": \"Serving\",\n" +
                    "                    \"weight\": 154.0\n" +
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
                    "            \"href\": \"https://api.edamam.com/api/food-database/v2/parser?session=44&ingr=apple&app_id=392a8fb6&app_key=028f5ddf7a61e1ef057fe3cb38a4e5ab\"\n" +
                    "        }\n" +
                    "    }\n" +
                    "}";
            HintsWrapper rs = new HintsWrapper();
            rs.setJsonString(str);
            JSONUtil.jsonHintsToFoods(rs, str);
            return rs;
        }
        return null;
    }

    @Override
    public NutrientWrapper nutritionRequest(String appId, String appKey, JSONObject obj) throws IOException {
        NutrientWrapper nw = new NutrientWrapper();
        String tmp = "{\n" +
                "    \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#d06e0d6e-4686-4ea4-b7ae-7b47fb54ec44\",\n" +
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
                "                    \"food\": \"apple\",\n" +
                "                    \"foodId\": \"food_a1gb9ubb72c7snbuxr3weagwv0dd\",\n" +
                "                    \"weight\": 182.0,\n" +
                "                    \"retainedWeight\": 182.0,\n" +
                "                    \"measureURI\": \"http://www.edamam.com/ontologies/edamam.owl#Measure_unit\",\n" +
                "                    \"status\": \"OK\"\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        nw.setJsonString(tmp);
        JSONUtil.jsonToNutrientWrapper(nw,tmp);
        return nw;
    }
}
