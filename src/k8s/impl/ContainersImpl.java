/**
 */
package k8s.impl;

import k8s.ContainerPort;
import k8s.Containers;
import k8s.EnvVar;
import k8s.K8sPackage;
import k8s.LifeCycle;
import k8s.Probe;
import k8s.ResourceRequirements;
import k8s.VolumeMount;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Containers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link k8s.impl.ContainersImpl#getName <em>Name</em>}</li>
 *   <li>{@link k8s.impl.ContainersImpl#getImage <em>Image</em>}</li>
 *   <li>{@link k8s.impl.ContainersImpl#isLiveRestart <em>Live Restart</em>}</li>
 *   <li>{@link k8s.impl.ContainersImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link k8s.impl.ContainersImpl#getEnv <em>Env</em>}</li>
 *   <li>{@link k8s.impl.ContainersImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link k8s.impl.ContainersImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link k8s.impl.ContainersImpl#getVolumeMounts <em>Volume Mounts</em>}</li>
 *   <li>{@link k8s.impl.ContainersImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link k8s.impl.ContainersImpl#getLivenessProbe <em>Liveness Probe</em>}</li>
 *   <li>{@link k8s.impl.ContainersImpl#getReadinessProbe <em>Readiness Probe</em>}</li>
 *   <li>{@link k8s.impl.ContainersImpl#getLifeCycle <em>Life Cycle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainersImpl extends MinimalEObjectImpl.Container implements Containers {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isLiveRestart() <em>Live Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLiveRestart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LIVE_RESTART_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLiveRestart() <em>Live Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLiveRestart()
	 * @generated
	 * @ordered
	 */
	protected boolean liveRestart = LIVE_RESTART_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerPort> ports;

	/**
	 * The cached value of the '{@link #getEnv() <em>Env</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnv()
	 * @generated
	 * @ordered
	 */
	protected EList<EnvVar> env;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<String> command;

	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> args;

	/**
	 * The cached value of the '{@link #getVolumeMounts() <em>Volume Mounts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeMounts()
	 * @generated
	 * @ordered
	 */
	protected EList<VolumeMount> volumeMounts;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected ResourceRequirements resources;

	/**
	 * The cached value of the '{@link #getLivenessProbe() <em>Liveness Probe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLivenessProbe()
	 * @generated
	 * @ordered
	 */
	protected Probe livenessProbe;

	/**
	 * The cached value of the '{@link #getReadinessProbe() <em>Readiness Probe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadinessProbe()
	 * @generated
	 * @ordered
	 */
	protected Probe readinessProbe;

	/**
	 * The cached value of the '{@link #getLifeCycle() <em>Life Cycle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeCycle()
	 * @generated
	 * @ordered
	 */
	protected LifeCycle lifeCycle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K8sPackage.Literals.CONTAINERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.CONTAINERS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.CONTAINERS__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLiveRestart() {
		return liveRestart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiveRestart(boolean newLiveRestart) {
		boolean oldLiveRestart = liveRestart;
		liveRestart = newLiveRestart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.CONTAINERS__LIVE_RESTART, oldLiveRestart, liveRestart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainerPort> getPorts() {
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorts(EList<ContainerPort> newPorts) {
		EList<ContainerPort> oldPorts = ports;
		ports = newPorts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.CONTAINERS__PORTS, oldPorts, ports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnvVar> getEnv() {
		return env;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnv(EList<EnvVar> newEnv) {
		EList<EnvVar> oldEnv = env;
		env = newEnv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.CONTAINERS__ENV, oldEnv, env));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(EList<String> newCommand) {
		EList<String> oldCommand = command;
		command = newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.CONTAINERS__COMMAND, oldCommand, command));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getArgs() {
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgs(EList<String> newArgs) {
		EList<String> oldArgs = args;
		args = newArgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.CONTAINERS__ARGS, oldArgs, args));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VolumeMount> getVolumeMounts() {
		return volumeMounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumeMounts(EList<VolumeMount> newVolumeMounts) {
		EList<VolumeMount> oldVolumeMounts = volumeMounts;
		volumeMounts = newVolumeMounts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.CONTAINERS__VOLUME_MOUNTS, oldVolumeMounts, volumeMounts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRequirements getResources() {
		if (resources != null && resources.eIsProxy()) {
			InternalEObject oldResources = (InternalEObject)resources;
			resources = (ResourceRequirements)eResolveProxy(oldResources);
			if (resources != oldResources) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, K8sPackage.CONTAINERS__RESOURCES, oldResources, resources));
			}
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRequirements basicGetResources() {
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResources(ResourceRequirements newResources) {
		ResourceRequirements oldResources = resources;
		resources = newResources;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.CONTAINERS__RESOURCES, oldResources, resources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Probe getLivenessProbe() {
		if (livenessProbe != null && livenessProbe.eIsProxy()) {
			InternalEObject oldLivenessProbe = (InternalEObject)livenessProbe;
			livenessProbe = (Probe)eResolveProxy(oldLivenessProbe);
			if (livenessProbe != oldLivenessProbe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, K8sPackage.CONTAINERS__LIVENESS_PROBE, oldLivenessProbe, livenessProbe));
			}
		}
		return livenessProbe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Probe basicGetLivenessProbe() {
		return livenessProbe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLivenessProbe(Probe newLivenessProbe) {
		Probe oldLivenessProbe = livenessProbe;
		livenessProbe = newLivenessProbe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.CONTAINERS__LIVENESS_PROBE, oldLivenessProbe, livenessProbe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Probe getReadinessProbe() {
		if (readinessProbe != null && readinessProbe.eIsProxy()) {
			InternalEObject oldReadinessProbe = (InternalEObject)readinessProbe;
			readinessProbe = (Probe)eResolveProxy(oldReadinessProbe);
			if (readinessProbe != oldReadinessProbe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, K8sPackage.CONTAINERS__READINESS_PROBE, oldReadinessProbe, readinessProbe));
			}
		}
		return readinessProbe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Probe basicGetReadinessProbe() {
		return readinessProbe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadinessProbe(Probe newReadinessProbe) {
		Probe oldReadinessProbe = readinessProbe;
		readinessProbe = newReadinessProbe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.CONTAINERS__READINESS_PROBE, oldReadinessProbe, readinessProbe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifeCycle getLifeCycle() {
		if (lifeCycle != null && lifeCycle.eIsProxy()) {
			InternalEObject oldLifeCycle = (InternalEObject)lifeCycle;
			lifeCycle = (LifeCycle)eResolveProxy(oldLifeCycle);
			if (lifeCycle != oldLifeCycle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, K8sPackage.CONTAINERS__LIFE_CYCLE, oldLifeCycle, lifeCycle));
			}
		}
		return lifeCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifeCycle basicGetLifeCycle() {
		return lifeCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifeCycle(LifeCycle newLifeCycle) {
		LifeCycle oldLifeCycle = lifeCycle;
		lifeCycle = newLifeCycle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.CONTAINERS__LIFE_CYCLE, oldLifeCycle, lifeCycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case K8sPackage.CONTAINERS__NAME:
				return getName();
			case K8sPackage.CONTAINERS__IMAGE:
				return getImage();
			case K8sPackage.CONTAINERS__LIVE_RESTART:
				return isLiveRestart();
			case K8sPackage.CONTAINERS__PORTS:
				return getPorts();
			case K8sPackage.CONTAINERS__ENV:
				return getEnv();
			case K8sPackage.CONTAINERS__COMMAND:
				return getCommand();
			case K8sPackage.CONTAINERS__ARGS:
				return getArgs();
			case K8sPackage.CONTAINERS__VOLUME_MOUNTS:
				return getVolumeMounts();
			case K8sPackage.CONTAINERS__RESOURCES:
				if (resolve) return getResources();
				return basicGetResources();
			case K8sPackage.CONTAINERS__LIVENESS_PROBE:
				if (resolve) return getLivenessProbe();
				return basicGetLivenessProbe();
			case K8sPackage.CONTAINERS__READINESS_PROBE:
				if (resolve) return getReadinessProbe();
				return basicGetReadinessProbe();
			case K8sPackage.CONTAINERS__LIFE_CYCLE:
				if (resolve) return getLifeCycle();
				return basicGetLifeCycle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case K8sPackage.CONTAINERS__NAME:
				setName((String)newValue);
				return;
			case K8sPackage.CONTAINERS__IMAGE:
				setImage((String)newValue);
				return;
			case K8sPackage.CONTAINERS__LIVE_RESTART:
				setLiveRestart((Boolean)newValue);
				return;
			case K8sPackage.CONTAINERS__PORTS:
				setPorts((EList<ContainerPort>)newValue);
				return;
			case K8sPackage.CONTAINERS__ENV:
				setEnv((EList<EnvVar>)newValue);
				return;
			case K8sPackage.CONTAINERS__COMMAND:
				setCommand((EList<String>)newValue);
				return;
			case K8sPackage.CONTAINERS__ARGS:
				setArgs((EList<String>)newValue);
				return;
			case K8sPackage.CONTAINERS__VOLUME_MOUNTS:
				setVolumeMounts((EList<VolumeMount>)newValue);
				return;
			case K8sPackage.CONTAINERS__RESOURCES:
				setResources((ResourceRequirements)newValue);
				return;
			case K8sPackage.CONTAINERS__LIVENESS_PROBE:
				setLivenessProbe((Probe)newValue);
				return;
			case K8sPackage.CONTAINERS__READINESS_PROBE:
				setReadinessProbe((Probe)newValue);
				return;
			case K8sPackage.CONTAINERS__LIFE_CYCLE:
				setLifeCycle((LifeCycle)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case K8sPackage.CONTAINERS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case K8sPackage.CONTAINERS__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case K8sPackage.CONTAINERS__LIVE_RESTART:
				setLiveRestart(LIVE_RESTART_EDEFAULT);
				return;
			case K8sPackage.CONTAINERS__PORTS:
				setPorts((EList<ContainerPort>)null);
				return;
			case K8sPackage.CONTAINERS__ENV:
				setEnv((EList<EnvVar>)null);
				return;
			case K8sPackage.CONTAINERS__COMMAND:
				setCommand((EList<String>)null);
				return;
			case K8sPackage.CONTAINERS__ARGS:
				setArgs((EList<String>)null);
				return;
			case K8sPackage.CONTAINERS__VOLUME_MOUNTS:
				setVolumeMounts((EList<VolumeMount>)null);
				return;
			case K8sPackage.CONTAINERS__RESOURCES:
				setResources((ResourceRequirements)null);
				return;
			case K8sPackage.CONTAINERS__LIVENESS_PROBE:
				setLivenessProbe((Probe)null);
				return;
			case K8sPackage.CONTAINERS__READINESS_PROBE:
				setReadinessProbe((Probe)null);
				return;
			case K8sPackage.CONTAINERS__LIFE_CYCLE:
				setLifeCycle((LifeCycle)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case K8sPackage.CONTAINERS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case K8sPackage.CONTAINERS__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case K8sPackage.CONTAINERS__LIVE_RESTART:
				return liveRestart != LIVE_RESTART_EDEFAULT;
			case K8sPackage.CONTAINERS__PORTS:
				return ports != null;
			case K8sPackage.CONTAINERS__ENV:
				return env != null;
			case K8sPackage.CONTAINERS__COMMAND:
				return command != null;
			case K8sPackage.CONTAINERS__ARGS:
				return args != null;
			case K8sPackage.CONTAINERS__VOLUME_MOUNTS:
				return volumeMounts != null;
			case K8sPackage.CONTAINERS__RESOURCES:
				return resources != null;
			case K8sPackage.CONTAINERS__LIVENESS_PROBE:
				return livenessProbe != null;
			case K8sPackage.CONTAINERS__READINESS_PROBE:
				return readinessProbe != null;
			case K8sPackage.CONTAINERS__LIFE_CYCLE:
				return lifeCycle != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", image: ");
		result.append(image);
		result.append(", liveRestart: ");
		result.append(liveRestart);
		result.append(", ports: ");
		result.append(ports);
		result.append(", env: ");
		result.append(env);
		result.append(", command: ");
		result.append(command);
		result.append(", args: ");
		result.append(args);
		result.append(", volumeMounts: ");
		result.append(volumeMounts);
		result.append(')');
		return result.toString();
	}

} //ContainersImpl
