package cybersoft.java11.group8.pizza_store.fb_category.service;

import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import cybersoft.java11.group8.pizza_store.common_data.GenericService;
import cybersoft.java11.group8.pizza_store.fb_category.dto.CreateBeverageDTO;
import cybersoft.java11.group8.pizza_store.fb_category.dto.UpdateBeverageDTO;
import cybersoft.java11.group8.pizza_store.fb_category.model.beverage.Beverage;

public interface BeverageService extends GenericService<Beverage, Long>{

	Beverage save(@Valid CreateBeverageDTO dto);

	boolean existBeverage(@Valid @NotNull Long beverageId);

	Beverage addRawMaterial(@Valid String rawMaterialName, @Valid @NotNull Long beverageId);

	boolean removeRawMeterialInBeverage(String rawMaterialName, @Valid @NotNull Long beverageId);

	Beverage update( @Valid UpdateBeverageDTO dto, Long beverageId);

	Optional<Beverage> findByCode(String code);

}
