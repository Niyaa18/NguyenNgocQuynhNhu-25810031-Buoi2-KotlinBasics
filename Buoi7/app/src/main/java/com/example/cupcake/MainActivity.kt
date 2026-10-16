/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.cupcake

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.saveable.rememberSaveableStateHolder
import androidx.compose.ui.Modifier
import com.example.cupcake.ui.theme.CupcakeTheme
import com.example.lunchtray.LunchTrayApp
import com.example.lunchtray.ui.theme.LunchTrayTheme

// Nguyen Ngoc Quynh Nhu - MSSV 25810031
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { CupcakeTheme { Buoi7App() } }
    }
}

@Composable
fun Buoi7App() {
    var selectedTab by rememberSaveable { mutableIntStateOf(0) }
    val stateHolder = rememberSaveableStateHolder()
    Column(Modifier.fillMaxSize().safeDrawingPadding()) {
        TabRow(selectedTabIndex = selectedTab) {
            listOf("Cupcake", "Lunch Tray").forEachIndexed { index, label ->
                Tab(selected = selectedTab == index,
                    onClick = { selectedTab = index },
                    text = { Text(label) })
            }
        }
        Box(Modifier.weight(1f).fillMaxWidth()) {
            stateHolder.SaveableStateProvider(selectedTab) {
                if (selectedTab == 0) {
                    CupcakeTheme { CupcakeApp() }
                } else {
                    LunchTrayTheme { LunchTrayApp() }
                }
            }
        }
    }
}
