package ru.fileManager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileManagerTest {
    FileManager manager = new FileManager();

    @Test
    void testPutValues() {
        manager.registerApp("IDEA", ".pom");
        manager.registerApp("Firefox", ".html");
        assertEquals(manager.getAllKeys().size(), 2);
    }

    @Test
    void testGetAppNameByExtension() {
        assertNull(manager.getAppNameByExtension(".pom"));
        manager.registerApp("IDEA", ".pom");
        assertEquals(manager.getAppNameByExtension(".pom"), "IDEA");
    }

    @Test
    void testRemoveExtension() {
        manager.registerApp("IDEA", ".pom");
        manager.registerApp("Firefox", ".html");
        manager.removeByExtension(".txt");
        assertEquals(manager.getAllKeys().size(), 2);
        manager.removeByExtension(".html");
        assertEquals(manager.getAllKeys().size(), 1);
        assertTrue(manager.getAllKeys().contains(".pom"));
    }

    @Test
    void testGetAllExtension() {
        manager.registerApp("IDEA", ".pom");
        manager.registerApp("Firefox", ".html");
        assertEquals(manager.getAllExtension().size(), 2);
    }

}