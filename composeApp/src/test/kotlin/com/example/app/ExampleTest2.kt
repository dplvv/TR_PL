
        import kotlin.test.Test
        import kotlin.test.assertTrue

        class ExampleTest2 {
            @Test
            fun testStringContains() {
                assertTrue("Hello, world!".contains("world"), "'world' should be in the string")
            }
        }
    