package org.example;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.TreeBidiMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void testadd() {
        BidiMap<String, String> bidi = new TreeBidiMap<>();
        bidi.putIfAbsent("Юля", "7-927-7972163");
        bidi.putIfAbsent("Марк", "7-920-2222012");
        assertEquals("7-927-7972163", bidi.putIfAbsent("Юля", "7-927-7972163"));
        assertEquals("7-920-2222012", bidi.putIfAbsent("Марк", "7-920-2222012"));
    }

    @Test
    void testfindByName() {
        BidiMap<String, String> bidi = new TreeBidiMap<>();
        bidi.putIfAbsent("Юля", "7-927-7972163");
        bidi.putIfAbsent("Марк", "7-920-2222012");
        bidi.putIfAbsent("Никита", "7-925-7732334");
        bidi.putIfAbsent("Дэйзи", "7-915-2534348");
        bidi.putIfAbsent("Михаил", "7-921-7972163");
        assertNull(bidi.get("Илья"));

    }

    @Test
    void testfindByNumber() {
        BidiMap<String, String> bidi = new TreeBidiMap<>();
        bidi.putIfAbsent("Юля", "7-927-7972163");
        bidi.putIfAbsent("Марк", "7-920-2222012");
        bidi.putIfAbsent("Никита", "7-925-7732334");
        bidi.putIfAbsent("Дэйзи", "7-915-2534348");
        bidi.putIfAbsent("Михаил", "7-921-7972163");
        Assertions.assertNull(bidi.getKey("89500000000"));

    }

    @Test
    void testprintAllNames() {
        BidiMap<String, String> bidi = new TreeBidiMap<>();
        bidi.putIfAbsent("Юля", "7-927-7972163");
        bidi.putIfAbsent("Марк", "7-920-2222012");
        bidi.putIfAbsent("Никита", "7-925-7732334");
        bidi.putIfAbsent("Дэйзи", "7-915-2534348");
        bidi.putIfAbsent("Михаил", "7-921-7972163");
        System.out.println(bidi);
    }
}