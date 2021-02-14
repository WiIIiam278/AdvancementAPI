package net.roxeez.advancement.common;

import net.roxeez.advancement.SerializerTest;
import net.roxeez.advancement.serialization.ObjectSerializer;
import org.bukkit.Material;
import org.junit.jupiter.api.DisplayName;


@DisplayName("Item tests")
public class ItemTest extends SerializerTest<Item> {

    @Override
    protected Item getObject() {
        Item item = new Item();

        item.is(Material.BEDROCK);
        item.count(10, 15);

        return item;
    }

    @Override
    protected String getJson() {
        return "{\"item\":\"minecraft:bedrock\",\"count\":{\"min\":10,\"max\":15}}";
    }

}
