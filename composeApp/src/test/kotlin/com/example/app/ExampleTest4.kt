
        import kotlin.test.Test
        import kotlin.test.assertFails

        class ExampleTest4 {
            @Test
            fun testFailingCondition() {
                assertFails { throw IllegalArgumentException("This is an expected failure") }
            }
        }
    