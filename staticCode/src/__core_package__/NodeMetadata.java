package __core_package__;

import java.util.Map;

public interface NodeMetadata extends ValueMetadata{
	
	/**
     * Returns metadata for those properties of the node, whose type is primitive or an array of primitive.
     */
	Map<String,ValueMetadata> primitiveValuesMeta();

}
