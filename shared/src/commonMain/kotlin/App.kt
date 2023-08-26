import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusProperties
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    MaterialTheme {
        var greetingText by remember { mutableStateOf("Hello, World!") }
        var showImage by remember { mutableStateOf(false) }
//        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
//            Button(onClick = {
//                greetingText = "Hello, ${getPlatformName()}"
//                showImage = !showImage
//            }) {
//                Text(greetingText)
//            }
//            AnimatedVisibility(showImage) {
//                Image(
//                    painterResource("compose-multiplatform.xml"),
//                    null
//                )
//            }
//        }


        val items = ArrayList<String>()
        items.add("1")
        items.add("1")
        items.add("1")
        items.add("1")
        LazyColumn {
            itemsIndexed(items) { index, item ->
                Text(text = "1\n2\n3\n4\n1\n" +
                        "2\n" +
                        "3\n" +
                        "4\n1\n" +
                        "2\n" +
                        "3\n" +
                        "4\n1\n" +
                        "2\n" +
                        "3\n" +
                        "4\n1\n" +
                        "2\n" +
                        "3\n" +
                        "3\n" +
                        "4\n1\n" +
                        "2\n" +
                        "3\n" +
                        "4\n\n\n\n\n",
                    modifier = Modifier.fillMaxWidth().clickable {

                    }.focusProperties {
                        canFocus = false
                    })
            }
        }
    }
}

expect fun getPlatformName(): String