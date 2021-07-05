create table edamamFood
(
    search_text text not null
        constraint edamam_pk
            primary key,
    item_info text
);

create table edamamNutrition
(
    food_id text not null,
    measure_uri text not null,
    nutrition text,
    constraint edamamNutrition_pk
        primary key (food_id, measure_uri)
);

