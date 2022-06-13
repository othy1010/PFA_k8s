/**
 */
package k8s.impl;

import java.util.Collection;

import k8s.ContainerPort;
import k8s.Containers;
import k8s.EnvVar;
import k8s.K8sPackage;
import k8s.LifeCycle;
import k8s.Probe;
import k8s.ResourceRequirements;
import k8s.VolumeMount;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link k8s.impl.ContainersImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link k8s.impl.ContainersImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link k8s.impl.ContainersImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link k8s.impl.ContainersImpl#getLivenessProbe <em>Liveness Probe</em>}</li>
 *   <li>{@link k8s.impl.ContainersImpl#getReadinessProbe <em>Readiness Probe</em>}</li>
 *   <li>{@link k8s.impl.ContainersImpl#getLifeCycle <em>Life Cycle</em>}</li>
 *   <li>{@link k8s.impl.ContainersImpl#getVolumeMounts <em>Volume Mounts</em>}</li>
 *   <li>{@link k8s.impl.ContainersImpl#getEnv <em>Env</em>}</li>
 *   <li>{@link k8s.impl.ContainersImpl#getPorts <em>Ports</em>}</li>
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
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<String> command;

	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> args;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected ResourceRequirements resources;

	/**
	 * The cached value of the '{@link #getLivenessProbe() <em>Liveness Probe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLivenessProbe()
	 * @generated
	 * @ordered
	 */
	protected Probe livenessProbe;

	/**
	 * The cached value of the '{@link #getReadinessProbe() <em>Readiness Probe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadinessProbe()
	 * @generated
	 * @ordered
	 */
	protected Probe readinessProbe;

	/**
	 * The cached value of the '{@link #getLifeCycle() <em>Life Cycle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeCycle()
	 * @generated
	 * @ordered
	 */
	protected LifeCycle lifeCycle;

	/**
	 * The cached value of the '{@link #getVolumeMounts() <em>Volume Mounts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeMounts()
	 * @generated
	 * @ordered
	 */
	protected EList<VolumeMount> volumeMounts;

	/**
	 * The cached value of the '{@link #getEnv() <em>Env</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnv()
	 * @generated
	 * @ordered
	 */
	protected EList<EnvVar> env;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerPort> ports;

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
	public EList<String> getCommand() {
		if (command == null) {
			command = new EDataTypeUniqueEList<String>(String.class, this, K8sPackage.CONTAINERS__COMMAND);
		}
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getArgs() {
		if (args == null) {
			args = new EDataTypeUniqueEList<String>(String.class, this, K8sPackage.CONTAINERS__ARGS);
		}
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRequirements getResources() {
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResources(ResourceRequirements newResources, NotificationChain msgs) {
		ResourceRequirements oldResources = resources;
		resources = newResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, K8sPackage.CONTAINERS__RESOURCES, oldResources, newResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResources(ResourceRequirements newResources) {
		if (newResources != resources) {
			NotificationChain msgs = null;
			if (resources != null)
				msgs = ((InternalEObject)resources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - K8sPackage.CONTAINERS__RESOURCES, null, msgs);
			if (newResources != null)
				msgs = ((InternalEObject)newResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - K8sPackage.CONTAINERS__RESOURCES, null, msgs);
			msgs = basicSetResources(newResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.CONTAINERS__RESOURCES, newResources, newResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Probe getLivenessProbe() {
		return livenessProbe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLivenessProbe(Probe newLivenessProbe, NotificationChain msgs) {
		Probe oldLivenessProbe = livenessProbe;
		livenessProbe = newLivenessProbe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, K8sPackage.CONTAINERS__LIVENESS_PROBE, oldLivenessProbe, newLivenessProbe);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLivenessProbe(Probe newLivenessProbe) {
		if (newLivenessProbe != livenessProbe) {
			NotificationChain msgs = null;
			if (livenessProbe != null)
				msgs = ((InternalEObject)livenessProbe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - K8sPackage.CONTAINERS__LIVENESS_PROBE, null, msgs);
			if (newLivenessProbe != null)
				msgs = ((InternalEObject)newLivenessProbe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - K8sPackage.CONTAINERS__LIVENESS_PROBE, null, msgs);
			msgs = basicSetLivenessProbe(newLivenessProbe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.CONTAINERS__LIVENESS_PROBE, newLivenessProbe, newLivenessProbe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Probe getReadinessProbe() {
		return readinessProbe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadinessProbe(Probe newReadinessProbe, NotificationChain msgs) {
		Probe oldReadinessProbe = readinessProbe;
		readinessProbe = newReadinessProbe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, K8sPackage.CONTAINERS__READINESS_PROBE, oldReadinessProbe, newReadinessProbe);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadinessProbe(Probe newReadinessProbe) {
		if (newReadinessProbe != readinessProbe) {
			NotificationChain msgs = null;
			if (readinessProbe != null)
				msgs = ((InternalEObject)readinessProbe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - K8sPackage.CONTAINERS__READINESS_PROBE, null, msgs);
			if (newReadinessProbe != null)
				msgs = ((InternalEObject)newReadinessProbe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - K8sPackage.CONTAINERS__READINESS_PROBE, null, msgs);
			msgs = basicSetReadinessProbe(newReadinessProbe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.CONTAINERS__READINESS_PROBE, newReadinessProbe, newReadinessProbe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifeCycle getLifeCycle() {
		return lifeCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLifeCycle(LifeCycle newLifeCycle, NotificationChain msgs) {
		LifeCycle oldLifeCycle = lifeCycle;
		lifeCycle = newLifeCycle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, K8sPackage.CONTAINERS__LIFE_CYCLE, oldLifeCycle, newLifeCycle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifeCycle(LifeCycle newLifeCycle) {
		if (newLifeCycle != lifeCycle) {
			NotificationChain msgs = null;
			if (lifeCycle != null)
				msgs = ((InternalEObject)lifeCycle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - K8sPackage.CONTAINERS__LIFE_CYCLE, null, msgs);
			if (newLifeCycle != null)
				msgs = ((InternalEObject)newLifeCycle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - K8sPackage.CONTAINERS__LIFE_CYCLE, null, msgs);
			msgs = basicSetLifeCycle(newLifeCycle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.CONTAINERS__LIFE_CYCLE, newLifeCycle, newLifeCycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VolumeMount> getVolumeMounts() {
		if (volumeMounts == null) {
			volumeMounts = new EObjectContainmentEList<VolumeMount>(VolumeMount.class, this, K8sPackage.CONTAINERS__VOLUME_MOUNTS);
		}
		return volumeMounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnvVar> getEnv() {
		if (env == null) {
			env = new EObjectContainmentEList<EnvVar>(EnvVar.class, this, K8sPackage.CONTAINERS__ENV);
		}
		return env;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainerPort> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<ContainerPort>(ContainerPort.class, this, K8sPackage.CONTAINERS__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case K8sPackage.CONTAINERS__RESOURCES:
				return basicSetResources(null, msgs);
			case K8sPackage.CONTAINERS__LIVENESS_PROBE:
				return basicSetLivenessProbe(null, msgs);
			case K8sPackage.CONTAINERS__READINESS_PROBE:
				return basicSetReadinessProbe(null, msgs);
			case K8sPackage.CONTAINERS__LIFE_CYCLE:
				return basicSetLifeCycle(null, msgs);
			case K8sPackage.CONTAINERS__VOLUME_MOUNTS:
				return ((InternalEList<?>)getVolumeMounts()).basicRemove(otherEnd, msgs);
			case K8sPackage.CONTAINERS__ENV:
				return ((InternalEList<?>)getEnv()).basicRemove(otherEnd, msgs);
			case K8sPackage.CONTAINERS__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case K8sPackage.CONTAINERS__COMMAND:
				return getCommand();
			case K8sPackage.CONTAINERS__ARGS:
				return getArgs();
			case K8sPackage.CONTAINERS__RESOURCES:
				return getResources();
			case K8sPackage.CONTAINERS__LIVENESS_PROBE:
				return getLivenessProbe();
			case K8sPackage.CONTAINERS__READINESS_PROBE:
				return getReadinessProbe();
			case K8sPackage.CONTAINERS__LIFE_CYCLE:
				return getLifeCycle();
			case K8sPackage.CONTAINERS__VOLUME_MOUNTS:
				return getVolumeMounts();
			case K8sPackage.CONTAINERS__ENV:
				return getEnv();
			case K8sPackage.CONTAINERS__PORTS:
				return getPorts();
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
			case K8sPackage.CONTAINERS__COMMAND:
				getCommand().clear();
				getCommand().addAll((Collection<? extends String>)newValue);
				return;
			case K8sPackage.CONTAINERS__ARGS:
				getArgs().clear();
				getArgs().addAll((Collection<? extends String>)newValue);
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
			case K8sPackage.CONTAINERS__VOLUME_MOUNTS:
				getVolumeMounts().clear();
				getVolumeMounts().addAll((Collection<? extends VolumeMount>)newValue);
				return;
			case K8sPackage.CONTAINERS__ENV:
				getEnv().clear();
				getEnv().addAll((Collection<? extends EnvVar>)newValue);
				return;
			case K8sPackage.CONTAINERS__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends ContainerPort>)newValue);
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
			case K8sPackage.CONTAINERS__COMMAND:
				getCommand().clear();
				return;
			case K8sPackage.CONTAINERS__ARGS:
				getArgs().clear();
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
			case K8sPackage.CONTAINERS__VOLUME_MOUNTS:
				getVolumeMounts().clear();
				return;
			case K8sPackage.CONTAINERS__ENV:
				getEnv().clear();
				return;
			case K8sPackage.CONTAINERS__PORTS:
				getPorts().clear();
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
			case K8sPackage.CONTAINERS__COMMAND:
				return command != null && !command.isEmpty();
			case K8sPackage.CONTAINERS__ARGS:
				return args != null && !args.isEmpty();
			case K8sPackage.CONTAINERS__RESOURCES:
				return resources != null;
			case K8sPackage.CONTAINERS__LIVENESS_PROBE:
				return livenessProbe != null;
			case K8sPackage.CONTAINERS__READINESS_PROBE:
				return readinessProbe != null;
			case K8sPackage.CONTAINERS__LIFE_CYCLE:
				return lifeCycle != null;
			case K8sPackage.CONTAINERS__VOLUME_MOUNTS:
				return volumeMounts != null && !volumeMounts.isEmpty();
			case K8sPackage.CONTAINERS__ENV:
				return env != null && !env.isEmpty();
			case K8sPackage.CONTAINERS__PORTS:
				return ports != null && !ports.isEmpty();
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
		result.append(", command: ");
		result.append(command);
		result.append(", args: ");
		result.append(args);
		result.append(')');
		return result.toString();
	}

} //ContainersImpl
