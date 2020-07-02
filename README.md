This is a potential implementation of a checkout with the possibility of promotions. 

Assumptions made:
 - more than one promotion can be applied to the basket
 - The promotions for line items should be applied first before basketPromotion gets applied
 
 
Things currently not implemented but considered: 
 - The order of promotions applied could (should?) be determined, e.g. line item promotions first, then basket promos. In my implementation this is controlled by adding it to a list in the correct order
 - The list of promotions could come from an external source or a property file for ease of changeability. I drafted a promotion_rules.yaml but the processing of this is not implemented. 
 
 