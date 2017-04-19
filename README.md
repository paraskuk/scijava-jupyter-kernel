# scijava-jupyter-kernel
[![Build Status](https://travis-ci.org/hadim/scijava-jupyter-kernel.svg?branch=master)](https://travis-ci.org/hadim/scijava-jupyter-kernel)

`scijava-jupyter-kernel` aims to be a Jupyter kernel that integrate well with ImageJ. See https://imagej.net/Scijava_Jupyter_Kernel for more details.

Under the hood `scijava-jupyter-kernel` uses the [Beaker base kernel](https://github.com/twosigma/beakerx/tree/master/kernel/base).

[Languages supported](https://imagej.net/Scripting#Supported_languages) are :

- Groovy
- Python
- BeanShell
- Clojure
- Java
- JavaScript
- R
- Ruby
- Scala

See here for more details : https://imagej.net/Scripting#Supported_languages

## Installation - Standalone

**Warning : do NOT WORK yet**

- Install [Anaconda](https://www.continuum.io/downloads)
- Install `scijava-jupyter-kernel` :

```bash
conda config --add channels conda-forge
conda install scijava-jupyter-kernel
```

## Installation - With Fiji integration

**Note : Installation will be much more easier once integrated to Fiji.**

- Clone, compile and install Beakerx base kernel :

```bash
git clone https://github.com/twosigma/beakerx.git
cd beakerx/kernel/base/
gradle publishToMavenLocal
```

- Clone and compile `scijava-jupyter-kernel` :

```bash
git clone https://github.com/hadim/scijava-jupyter-kernel.git
cd scijava-jupyter-kernel
mvn -Dimagej.app.directory="PATH-TO-YOUR-IMAGEJ-REPO" install
```

- Start Fiji and launch `Analyze > Jupyter Kernel > Install Scijava Kernel`.
- Set the path to your Python binary.
- Choose a language (for example `jython` or `groovy`) or you can choose to install all the available languages.
- Choose a log level.

## Usage

To enjoy your new kernel(s), execute `jupyter notebook` or `jupyter lab`. Your kernel should appear in the kernel list.

## Screenshot

![Scijava Jupyter Kernel Installation](teaser.gif)

## About Python

We strongly suggest the use of the [Anaconda Python distribution](https://www.continuum.io/downloads) + the use of the [conda-forge channel](https://conda-forge.github.io/). That way, your Python and all your libs will be kept synced and updated.

## License

Under Apache 2.0 license. See [LICENSE](LICENSE).

## Authors

- Hadrien Mary <hadrien.mary@gmail.com>
