/**
 */
package k8s.impl;

import java.util.Collection;
import k8s.ApiVersion;
import k8s.K8sPackage;
import k8s.Kind;
import k8s.Manifest;
import k8s.Metadata;
import k8s.Spec;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manifest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link k8s.impl.ManifestImpl#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link k8s.impl.ManifestImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link k8s.impl.ManifestImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link k8s.impl.ManifestImpl#getSpec <em>Spec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManifestImpl extends MinimalEObjectImpl.Container implements Manifest {
	/**
	 * The default value of the '{@link #getApiVersion() <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiVersion()
	 * @generated
	 * @ordered
	 */
	protected static final ApiVersion API_VERSION_EDEFAULT = ApiVersion.V1;

	/**
	 * The cached value of the '{@link #getApiVersion() <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiVersion()
	 * @generated
	 * @ordered
	 */
	protected ApiVersion apiVersion = API_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final Kind KIND_EDEFAULT = Kind.CERTIFICATE_SIGNING_REQUEST;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected Kind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<Metadata> metadata;

	/**
	 * The cached value of the '{@link #getSpec() <em>Spec</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpec()
	 * @generated
	 * @ordered
	 */
	protected EList<Spec> spec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManifestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K8sPackage.Literals.MANIFEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiVersion getApiVersion() {
		return apiVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiVersion(ApiVersion newApiVersion) {
		ApiVersion oldApiVersion = apiVersion;
		apiVersion = newApiVersion == null ? API_VERSION_EDEFAULT : newApiVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.MANIFEST__API_VERSION, oldApiVersion, apiVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(Kind newKind) {
		Kind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.MANIFEST__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metadata> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectResolvingEList<Metadata>(Metadata.class, this, K8sPackage.MANIFEST__METADATA);
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Spec> getSpec() {
		if (spec == null) {
			spec = new EObjectResolvingEList<Spec>(Spec.class, this, K8sPackage.MANIFEST__SPEC);
		}
		return spec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case K8sPackage.MANIFEST__API_VERSION:
				return getApiVersion();
			case K8sPackage.MANIFEST__KIND:
				return getKind();
			case K8sPackage.MANIFEST__METADATA:
				return getMetadata();
			case K8sPackage.MANIFEST__SPEC:
				return getSpec();
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
			case K8sPackage.MANIFEST__API_VERSION:
				setApiVersion((ApiVersion)newValue);
				return;
			case K8sPackage.MANIFEST__KIND:
				setKind((Kind)newValue);
				return;
			case K8sPackage.MANIFEST__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends Metadata>)newValue);
				return;
			case K8sPackage.MANIFEST__SPEC:
				getSpec().clear();
				getSpec().addAll((Collection<? extends Spec>)newValue);
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
			case K8sPackage.MANIFEST__API_VERSION:
				setApiVersion(API_VERSION_EDEFAULT);
				return;
			case K8sPackage.MANIFEST__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case K8sPackage.MANIFEST__METADATA:
				getMetadata().clear();
				return;
			case K8sPackage.MANIFEST__SPEC:
				getSpec().clear();
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
			case K8sPackage.MANIFEST__API_VERSION:
				return apiVersion != API_VERSION_EDEFAULT;
			case K8sPackage.MANIFEST__KIND:
				return kind != KIND_EDEFAULT;
			case K8sPackage.MANIFEST__METADATA:
				return metadata != null && !metadata.isEmpty();
			case K8sPackage.MANIFEST__SPEC:
				return spec != null && !spec.isEmpty();
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
		result.append(" (apiVersion: ");
		result.append(apiVersion);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //ManifestImpl
