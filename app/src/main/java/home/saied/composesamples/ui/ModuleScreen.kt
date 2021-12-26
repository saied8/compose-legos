package home.saied.composesamples.ui

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import home.saied.samples.SampleFile
import home.saied.samples.SampleModule

@Composable
fun ModuleScreen(sampleModule: SampleModule, onFileClick: (Int) -> Unit) {
    LazyColumn {
        item {
            Spacer(modifier = Modifier.height(32.dp))
        }
        itemsIndexed(sampleModule.sampleFileList, itemContent = { index, item ->
            ListItem(title = item.name, Modifier.padding(horizontal = 16.dp)) {
                onFileClick(index)
            }
            Spacer(modifier = Modifier.height(8.dp))
        })
    }
}