package com.example.englishappforkid.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.englishappforkid.data.Topic

@Composable
fun TopicGridItem(topic: Topic, onClick: () -> Unit) {
    Card(modifier = Modifier.padding(8.dp).aspectRatio(1f).clickable(onClick = onClick)) {
        Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Icon(imageVector = getIconForTopic(topic.name), contentDescription = null, modifier = Modifier.size(48.dp))
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = topic.name, style = MaterialTheme.typography.titleSmall)
        }
    }
}