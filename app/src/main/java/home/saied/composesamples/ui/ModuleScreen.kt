package home.saied.composesamples.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ListItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import home.saied.samples.SampleModule

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ModuleScreen(sampleModule: SampleModule, onFileClick: (Int) -> Unit) {
    LazyColumn {
        item {
            Spacer(modifier = Modifier.height(32.dp))
        }
        itemsIndexed(sampleModule.sampleFileList, itemContent = { index, item ->
            ListItem(
                text = { Text(text = item.name) },
                modifier = Modifier.padding(horizontal = 16.dp).clickable {
                        onFileClick(index)
                }
            )
            Spacer(modifier = Modifier.height(8.dp))
        })
    }
}